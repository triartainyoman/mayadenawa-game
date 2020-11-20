
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
    public static int statusMinibos1 = 0;
    public static int statusMinibos2 = 0;
    public static int musuh = 0;
    public static int winLevel1 = 0;
    public static int winLevel2 = 0;
    public static int minibos1()
    {
        return statusMinibos1;
    }
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
        if(winLevel1 == 1)
        {
            getWorld().addObject(new Life(), 664, 545);
        }
        
        if(winLevel2 == 1)
        {
            getWorld().addObject(new Life(), 664, 545);
        }
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
        if(Level1.score.getValue() >= 5 && Levels.level == 1)
        {
            statusMinibos1 = 1;
            if(musuh == 3)
            {
            getWorld().addObject(new MiniBos(), 664, 522);
            Level1.score.add(1);
            musuh += 1;
            //Greenfoot.addObject()
            }
        }
        
        //if(level1.score.getValue() >= 100 && Levels.level == 2)
        if(Level1.score.getValue() >= 5 && Levels.level == 2)
        {
            statusMinibos1 = 1;
            if(musuh == 2)
            {
                getWorld().addObject(new Mayadenawa(), 664, 522);
                Level1.score.add(1);
                musuh += 1;
            }
        }
        
        if(Level1.life.getValue() <= 0)   
         {  
           setImage("lose.png");
           Level1.life.setValue(0);     
           Greenfoot.delay(100);  
           Greenfoot.setWorld(new GameOver());  
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
        
        if(isTouching(ApiMinibos.class))
        {
           Greenfoot.playSound("kena.wav");            
           removeTouching(ApiMinibos.class);
           Level1.life.add(-1);
        }
    }
}
