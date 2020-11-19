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
    public static Counter scoreIndra = new Counter("Score: ");
    public GameOver()
    {
        scoreIndra.setValue(Level1.score.getValue());
        addObject(scoreIndra,240,330);
        prepare();
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
