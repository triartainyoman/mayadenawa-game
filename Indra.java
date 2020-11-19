import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Indra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Indra extends Actor
{
    /**
     * Act - do whatever the Indra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage indra = new GifImage("indra.gif");
    
    private final int gravity = 1;
    private int valacity;
    int delay = 0;
    public Indra()
    {
        valacity = 0;
    }
    public void act() 
    {
        // Add your action code here.
        setImage( indra.getCurrentImage() );
        fall();
        checkKey();
    }    
    
    public void checkKey()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2, getY());
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2, getY()); 
        }
        
        if(Greenfoot.isKeyDown("space"))
        {
            jump();
        }
        
        if(Greenfoot.isKeyDown("f"))
        {
            shoot();
        } 
        
        countDelay();
    }
    
    public void fall()
    {
        setLocation(getX(), getY() + valacity);
        if(getY() > getWorld().getHeight() - 82) valacity = 0;
        else valacity += gravity;
    }
    
    public void jump()
    {
        valacity = -10;
    }
    
    public void shoot()
    {
        if(delay > 15 )
        {
            getWorld().addObject(new Panah(), getX(), getY());
            Greenfoot.playSound("panah.wav");
            delay = 0;
        }
    }
    
    public void countDelay()
    {
        delay++;
    }
}
