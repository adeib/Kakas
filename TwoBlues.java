/**
 * Write a description of class TwoBlues here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class TwoBlues extends GunModel 
{
    protected void clockingFire(Fighter fighter){
        List<Bullet> bullets = new ArrayList<Bullet>();
        for(int i=1;i<=2;i++){
            bullets.add(new
            WeakBullet().setInitialPosAndReturn(fighter.Gun1_XPos(i), 
            fighter.Gun1_YPos(i))); 
        } 
        fighter.fireGun(bullets); 
    } 

    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class TwoBlues
     */
    public TwoBlues()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
