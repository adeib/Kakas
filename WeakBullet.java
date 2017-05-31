import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WeakBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WeakBullet extends Bullet
{
   public WeakBullet(){
       this.setMovingSpeed(8);
    }
   public WeakBullet(int degree){
       this.setMovingSpeed(8);
       this.turn(degree);
    }
    public void keepMove(){
        if (getRotation()==0){
            moveUP();
        }else{
            move(this.getMovingSpeed());
        }
    }
}
