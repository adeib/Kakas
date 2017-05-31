/**
 * Write a description of class TimeCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeCounter  
{
    private int timer;  
    private int delay,delayTimes;
    private boolean skip; 
    private boolean isDelaying;
    public TimeCounter(int delay, int delayTimes){ 
             this.delay = delay;      
             this.delayTimes = delayTimes;
             skip = false; 
    }      
    public boolean delayWithSkipper(){
        isDelaying = true;  
        if (timer/delay == delayTimes)
        {   
            skip = !skip;   
            timer = 0; 
        } 
        if (timer%delay == 0){  
            if(!skip)
            { 
                isDelaying = false;  
            }
        } 
        timer++;  
        return isDelaying; 
    }  
    public boolean delay(){ 
        isDelaying = true;  
        if (timer%delay == 0){  
            isDelaying = false;  
            timer = 0; 
        } 
        timer++;    
        return isDelaying; 
    }      
}
