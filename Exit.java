import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Buttons
{
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("klik.wav");            
            Greenfoot.setWorld(new MenuScreen());
            Level1.score.setValue(0);
            Level1.life.setValue(5);
            Level3.life2.setValue(25);
            Indra.musuh = 0;
            Indra.statusMinibos1 = 0;
            Level3.level3Sound.stop();
            WinScreen.winSound.stop();
        }
    }    
}
