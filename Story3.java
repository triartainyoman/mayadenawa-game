import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Story3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story3 extends Stories
{

    /**
     * Constructor for objects of class Story3.
     * 
     */
    public Story3()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BtnFinal btnFinal = new BtnFinal();
        addObject(btnFinal,695,563);
    }
}
