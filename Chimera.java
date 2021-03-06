import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
/**
 * Write a description of class Chimera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chimera extends Actor
{
    /**
     * Act - do whatever the Chimera wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage chimera = new GifImage("chimeraKanan.gif");
    GifImage chimera2 = new GifImage("chimeraKiri.gif");
    int chimeraKanan = 1;
    
    private int delay = 0;
    public void act() 
    {
        // Add your action code here.
        setImage( chimera.getCurrentImage() );
        checkChimera();
        countDelay();
        
        if(delay == 50)
        {
            getWorld().addObject(new ApiChimera(), getX(), getY());
            Greenfoot.playSound("api.wav");
            delay = 0;
        }
        if(isTouching(Panah.class))
        {
            if(Indra.minibos1() == 0)
            {
            Greenfoot.playSound("kena.wav");            
            removeTouching(Panah.class);
            Level1.score.add(3);
            getWorld().addObject(new Chimera(),30,179);
            //getWorld().addObject(new Chimera(),Greenfoot.getRandomNumber(getWorld().getWidth()),179);
            getWorld().removeObject(this);    
            }
            
            if(Indra.minibos1() == 1)
            {
                Greenfoot.playSound("kena.wav");            
            removeTouching(Panah.class);
            Level1.score.add(3);
            getWorld().removeObject(this);
            Indra.musuh += 1;
            }
        }
    }    
        
    public void checkChimera()
    {
        if(chimeraKanan == 1)
        {
            setImage(chimera.getCurrentImage());
            setLocation(getX()+2, getY());
            if(isAtEdge())
            {
                chimeraKanan = 0;
            }
        }
        else if(chimeraKanan == 0)
        {
            setImage(chimera2.getCurrentImage());
            setLocation(getX()-2, getY());
            if(isAtEdge())
            {
                chimeraKanan = 1;
            }
        }
       
    }
    
    public void countDelay()
    {
        delay++;
    }
}
