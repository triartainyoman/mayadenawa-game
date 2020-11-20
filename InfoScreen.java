import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InfoScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InfoScreen extends Menus
{

    /**
     * Constructor for objects of class InfoScreen.
     * 
     */
    public InfoScreen()
    {
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BtnBack btnBack = new BtnBack();
        addObject(btnBack,69,555);
    }
}
