import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ApiChimera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ApiChimera extends Actor
{
    /**
     * Act - do whatever the ApiChimera wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY()+5);
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }    
}
