import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HujanApi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HujanApi extends Actor
{
    /**
     * Act - do whatever the HujanApi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         setLocation(getX(), getY()+5);
        if(isAtEdge())
            setLocation(Greenfoot.getRandomNumber(400),0);
    }    
}
