import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalMayadenawa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalMayadenawa extends Actor
{
    /**
     * Act - do whatever the FinalMayadenawa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage finalmayadenawa = new GifImage("finalMayadenawa.gif");
    private int delay = 0;
    private final int gravity = 1;
    private int valacity;
    
    private int hitFinalMayadenawa = 0;
    public void act() 
    {
        // Add your action code here.
        setImage( finalmayadenawa.getCurrentImage() );
        fall();
        if(getY() > getWorld().getHeight() - 82) jump();
        countDelay();
        shoot();
        
        if(isTouching(Panah.class))
        {
            Greenfoot.playSound("kena.wav");            
            removeTouching(Panah.class);
            Level1.score.add(10);
            hitFinalMayadenawa+=1;
            Level3.life2.add(-1);
            // getWorld().removeObject(this);
        }
        
        if(hitFinalMayadenawa == 25)
        {
            getWorld().removeObject(this);
            Indra.winLevel2 = 1;
            hitFinalMayadenawa++;
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
