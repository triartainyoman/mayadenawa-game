import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Story1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story1 extends Stories
{

    /**
     * Constructor for objects of class Story1.
     * 
     */
    public Story1()
    {
        MenuScreen.menuSound.stop();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BtnNext btnNext = new BtnNext();
        addObject(btnNext,726,563);
        btnNext.setLocation(724,563);
    }
}
