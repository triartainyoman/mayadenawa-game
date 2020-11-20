import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BtnBack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BtnBack extends Buttons
{
    /**
     * Act - do whatever the BtnBack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("enter"))
        {
            // MenuScreen.menuSound.stop();
            Greenfoot.setWorld(new MenuScreen());
            Greenfoot.playSound("klik.wav");
        }
    }    
}
