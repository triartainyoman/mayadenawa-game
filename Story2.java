import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Story2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story2 extends Stories
{

    /**
     * Constructor for objects of class Story2.
     * 
     */
    public Story2()
    {
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
    }
}
