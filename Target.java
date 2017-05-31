import greenfoot.*; 
  
public class Target extends Movable 
{      
    private int health = 5; 
      
    public void act()  
    { 
        if(inTheWorld())this.moveDOWN(); 
    }          
    public int getHealth(){       
        return this.health; 
    }      
    public void setHealth(int power){    
        this.health = power; 
    }      
    public void getFired(int power){     
        this.health -= power;   
        if (this.health <=0 ){ 
            getWorld().removeObject(this); 
        } 
    }      
} 
