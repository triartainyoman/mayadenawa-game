import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends Actor
{
    /**
     * Act - do whatever the End wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new MenuScreen());
            Greenfoot.playSound("klik.wav");
            Levels.level = 1;
            
            GameOver.gameoverSound.stop();
        }
    }    
}
