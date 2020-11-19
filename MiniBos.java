import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MiniBos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiniBos extends Actor
{
    /**
     * Act - do whatever the MiniBos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage minibos = new GifImage("minibosJalan.gif");
    private int delay = 0;
    private final int gravity = 1;
    private int valacity;
    
    private int hitMinibos = 0;
    public void act() 
    {
        // Add your action code here.
        setImage( minibos.getCurrentImage() );
        //setLocation(getX()-1, getY());
        fall(); 
        if(getY() > getWorld().getHeight() - 82) jump();
        shoot();
        countDelay();
        
        if(isTouching(Panah.class))
        {
            Greenfoot.playSound("kena.wav");            
            removeTouching(Panah.class);
            Level1.score.add(5);
            hitMinibos++;
        }
        
        if(hitMinibos == 10)
        {
            getWorld().removeObject(this);
            Indra.winLevel1 = 1;
            hitMinibos++;
        }
    }  
    
    public void shoot()
    {
        if(delay > 70 )
        {
            getWorld().addObject(new ApiMinibos(), getX(), getY());
            Greenfoot.playSound("api.wav");
            delay = 0;
        }
    }
    
    public void countDelay()
    {
        delay++;
    }
    
    public void fall()
    {
        setLocation(getX(), getY() + valacity);
        if(getY() > getWorld().getHeight() - 82) valacity = 0;
        else valacity += gravity;
    }
    
    public void jump()
    {
        valacity = -15;
    }
    
    
}
