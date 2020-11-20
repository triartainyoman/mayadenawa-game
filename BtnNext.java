import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BtnNext here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BtnNext extends Buttons
{
    /**
     * Act - do whatever the BtnNext wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("klik.wav");
            if(Levels.level == 1)
            {
                Greenfoot.setWorld(new Level1());
            }
            
            if(Levels.level == 2)
            {
                Greenfoot.setWorld(new Level2());
                Levels.win = 1;
            }
        }
    }    
}
