import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Levels
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    static GreenfootSound level1Sound = new GreenfootSound("level1.wav");

    public Level1()
    {
        level1Sound.playLoop();
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

        Ogre ogre = new Ogre();
        addObject(ogre,800,522); 

        Chimera chimera = new Chimera();
        addObject(chimera,30,179);
        
        Ogre ogre2 = new Ogre();
        addObject(ogre2,664,525);
    }
}
