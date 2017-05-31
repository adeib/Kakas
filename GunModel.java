import java.util.*; 
 public class GunModel 
{ 
    private TimeCounter delayer; 
             public GunModel(){ 
        delayer = new TimeCounter(12,4); 
    }      
    public void fireGun(Fighter fighter){ 
        if(!delayer.delay()){       
            clockingFire(fighter); 
        } 
    }        
    protected void clockingFire(Fighter fighter){  
        List<Bullet> bullets = new ArrayList<Bullet>();    
        bullets.add(new 
        DefaultBullet().setInitialPosAndReturn(fighter.Gun1_XPos(5),
        fighter.Gun1_YPos(7)));       
        fighter.fireGun(bullets); 
    } 
} 
 
