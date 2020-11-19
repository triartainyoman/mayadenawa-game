import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ogre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ogre extends Actor
{
    /**
     * Act - do whatever the Ogre wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage ogre = new GifImage("ogre.gif");
    public void act() 
    {
        // Add your action code here.
        setImage( ogre.getCurrentImage());
        setLocation(getX() - 1, getY()); 
        if(isAtEdge())
        {
            setLocation(800, 522); 
        }
        
        if(isTouching(Panah.class))
        {
            Greenfoot.playSound("kena.wav");            
            removeTouching(Panah.class);
            getWorld().addObject(new Ogre(), 800, 522);
            getWorld().removeObject(this);
        }
    }    
}
