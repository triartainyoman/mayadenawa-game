import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Levels
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    static GreenfootSound level3Sound = new GreenfootSound("level2.wav");
    static Counter life2 = new Counter ("Mayadenawa Life :  ");
    public Level3()
    {
        level3Sound.playLoop();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Indra indra = new Indra();
        addObject(indra,67,513);
        indra.setLocation(62,519);

        Level1.score.setValue(Level1.score.getValue());
        addObject(Level1.score,50,18);

        //Level1.life.setValue(Level1.life.getValue());

        //untuk development
        if(Level1.life.getValue() == 0)
        {
            Level1.life.setValue(5);
        }
        addObject(Level1.life,160,18);

        FinalMayadenawa finalMayadenawa = new FinalMayadenawa();
        addObject(finalMayadenawa,678,470);

        Counter life2 = new Counter("Mayadenawa Life :  ");
        addObject(life2,729,19);
        life2.setLocation(680,19);
        life2.setValue(25);

        ApiChimera apiChimera = new ApiChimera();
        addObject(apiChimera,97,18);
        HujanApi hujanApi = new HujanApi();
        addObject(hujanApi,211,22);
        removeObject(apiChimera);
    }
}
