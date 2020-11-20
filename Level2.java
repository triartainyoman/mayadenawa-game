import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Levels
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    static GreenfootSound level2Sound = new GreenfootSound("level2.wav");

    public Level2()
    {
        if(Levels.level == 1)
        {
            Levels.level += 1;
        }
        level2Sound.playLoop(); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Indra indra = new Indra();
        addObject(indra,61,518);

        Level1.score.setValue(Level1.score.getValue());
        addObject(Level1.score,50,18);

        //Level1.life.setValue(Level1.life.getValue());
        Level1.life.setValue(5);
        addObject(Level1.life,744,19);

        Chimera chimera = new Chimera();
        addObject(chimera,30,179);
        
        Chimera chimera2 = new Chimera();
        addObject(chimera2,765,246);
    }
}
