
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
    private int delay = 0;
    public int totalKenaHit = 0;
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
        kenaHit();
        checkScore();
        
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
    
    public void checkScore()  
    {  
        if(totalKenaHit == 5)   
         {  
           setImage("indra mati.jpeg");
           Level1.life.setValue(0);     
           Greenfoot.delay(5000);  
           Greenfoot.setWorld(new MenuScreen());  
         }  
    }
    
    public void kenaHit()
    {
        if(isTouching(Ogre.class))
        {
           World world;  
           world = getWorld();  
           Greenfoot.playSound("kena.wav");            
           removeTouching(Ogre.class);
           Level1.life.add(-1);
           getWorld().addObject(new Ogre(), 800, 522);
        }
        
        if(isTouching(Chimera.class))
        {
           World world;  
           world = getWorld();  
           Greenfoot.playSound("kena.wav");            
           removeTouching(Chimera.class);
           Level1.life.add(-1);
           getWorld().addObject(new Chimera(), 30,179);
        }
        
        if(isTouching(ApiChimera.class))
        {
           Greenfoot.playSound("kena.wav");            
           removeTouching(ApiChimera.class);
           Level1.life.add(-1);
           getWorld().addObject(new ApiChimera(), 800, 522);
        }
        
    }
}
