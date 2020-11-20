import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mayadenawa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mayadenawa extends Actor
{
    /**
     * Act - do whatever the Mayadenawa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage mayanenawa = new GifImage("mayadenawaJalan.gif");
    
    private int delay = 0;
    private final int gravity = 1;
    private int valacity;
    
    private int hitMayadenawa = 0;
    public void act() 
    {
        // Add your action code here. 
        setImage( mayanenawa.getCurrentImage() );
        fall();
        if(getY() > getWorld().getHeight() - 82) jump();
        countDelay();
        shoot();
        
        if(isTouching(Panah.class))
        {
            Greenfoot.playSound("kena.wav");            
            removeTouching(Panah.class);
            Level1.score.add(5);
            hitMayadenawa+=1;
            // getWorld().removeObject(this);
        }
        
        if(hitMayadenawa == 10)
        {
            getWorld().removeObject(this);
            Indra.winLevel2 = 1;
            hitMayadenawa++;
        }
    } 
    
    public void shoot()
    {
        if(delay > 69 )
        {
            Greenfoot.delay(5);
            getWorld().addObject(new ApiMinibos(), getX(), getY());
            Greenfoot.playSound("api.wav");
        }
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
