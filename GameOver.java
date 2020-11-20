import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Menus
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    static GreenfootSound gameoverSound = new GreenfootSound("kalah.wav");
    public static Counter scoreIndra = new Counter("Score: ");
    public GameOver()
    {
        Level1.level1Sound.stop();
        Level2.level2Sound.stop();
        //Level3.level3Sound.stop();
            
        gameoverSound.playLoop();
        scoreIndra.setValue(Level1.score.getValue());
        addObject(scoreIndra,240,330);
        prepare();
        Level1.score.setValue(0);
        Level1.life.setValue(5);
        Indra.musuh = 0;
        Indra.statusMinibos1 = 0;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        End end = new End();
        addObject(end,234,410);
        end.setLocation(243,410);
        end.setLocation(238,410);
    }
}
