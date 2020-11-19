import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Panah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Panah extends Actor
{
    /**
     * Act - do whatever the Panah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX()+8, getY());
        if(isAtEdge())
        {    
            getWorld().removeObject(this);
         
        }   
    }    
}
