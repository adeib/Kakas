import greenfoot.*; 
 
public class Bullet extends Movable 
{ 
    private int power = 1;  
    private int initX;   
    private int initY; 
        
    public int getPower() 
    { 
        return this.power; 
    }      
    public void setPower(int power){   
        this.power = power; 
    }      
    public void hitTarget() 
    { 
        if(!inTheWorld())
        return; 
        Target target = (Target) getOneObjectAtOffset(0 ,0, Target.class);    
        if(target != null){     
            int power = this.getPower();  
            this.setPower(0);       
            target.getFired(power);
            getWorld().removeObject(this); 
        } 
    } 
    public void setInitialPos(int x, int y){   
        this.initX = x;  
        this.initY = y; 
    }       
    public Bullet setInitialPosAndReturn(int x, int y){
        this.initX = x;      
        this.initY = y;      
        return this; 
    }      
    public int getInitX(){ 
        return this.initX; 
    }      
    public int getInitY(){    
        return this.initY; 
    }      
    public void keepMove(){   
        moveUP(); 
    }      
    public void act(){        
        if(!inTheWorld())
        return;         
        keepMove();     
        hitTarget(); 
    } 
     
} 
