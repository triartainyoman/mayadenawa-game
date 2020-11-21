import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life extends Actor
{
    /**
     * Act - do whatever the Life wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        // Add your action code here.
        if(Levels.level == 1)
        {
            if(isTouching(Indra.class))
            {
                Level1.level1Sound.stop();
                Greenfoot.setWorld(new Story2());
                Indra.winLevel1 = 0;
                Indra.statusMinibos1 = 0;
                Indra.musuh = 0;
                Levels.level += 1;
                Level1.life.add(1);
            }
        }
        
        if(Levels.level == 2 && Levels.win == 1)
        {
            if(isTouching(Indra.class))
            {
                Level2.level2Sound.stop();
                Greenfoot.setWorld(new Story3());
                Indra.winLevel2 = 0;
                Indra.statusMinibos1 = 0;
                Indra.musuh = 0;
                Levels.level = 3;
                Level1.life.add(1);
            } 
        }
        
        if(Levels.win == 2)
        {
            if(isTouching(Indra.class))
            {
                Level3.level3Sound.stop(); 
                Greenfoot.setWorld(new WinScreen());
                Indra.winLevel2 = 0;
                Indra.statusMinibos1 = 0;
                Indra.musuh = 0;
                Levels.level = 1;
                Level1.life.add(1); 
            }
        }
       
    }    
}
