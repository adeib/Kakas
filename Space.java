import greenfoot.*; 
  
public class Space extends World 
{ 
    public Space()     {     
        super(600, 400, 1);  
 
        prepare(); 
    }  
    public void act(){ 
        if(Greenfoot.getRandomNumber(1000)<4){  
            addObject(new 
            SmallMeteor(),Greenfoot.getRandomNumber(getWidth()),1); 
        } 
        if(Greenfoot.getRandomNumber(100)<1){ 
            addObject(new 
            BigMeteor(),Greenfoot.getRandomNumber(getWidth()),1); 
        } 
         
    }      
    private void prepare() 
    { 
        Fighter fighter2 = new Fighter();  
        addObject(fighter2, 108, 316); 
        Fighter fighter3 = new Fighter(8,"w","s","a","d");  
        addObject(fighter3, 327, 337); 
    } 
 
 
} 
