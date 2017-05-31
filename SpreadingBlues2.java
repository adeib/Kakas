/**
 * Write a description of class SpreadingBlues2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class SpreadingBlues2 extends GunModel 
{
    protected void clockingFire(Fighter fighter){
        List<Bullet> bullets = new ArrayList<Bullet>();
        bullets.add(new
        WeakBullet().setInitialPosAndReturn(fighter.Gun2_XPos(3),
        fighter.Gun2_YPos(3)));
        bullets.add(new 
        WeakBullet(295).setInitialPosAndReturn(fighter.Gun2_XPos(2),
        fighter.Gun2_YPos(2)));
        bullets.add(new 
        WeakBullet(320).setInitialPosAndReturn(fighter.Gun2_XPos(1),
        fighter.Gun2_YPos(1)));
        bullets.add(new 
        WeakBullet(250).setInitialPosAndReturn(fighter.Gun2_XPos(3),
        fighter.Gun2_YPos(3)));
        bullets.add(new
        WeakBullet(225).setInitialPosAndReturn(fighter.Gun2_XPos(4), 
        fighter.Gun2_YPos(4)));
        fighter.fireGun(bullets); 
    } 

    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class SpreadingBlues2
     */
    public SpreadingBlues2()
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
