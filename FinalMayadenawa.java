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
    public void act() 
    {
        // Add your action code here.
        setImage( finalmayadenawa.getCurrentImage() );
    }    
}
