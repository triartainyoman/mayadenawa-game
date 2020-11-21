import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TeamScreen extends Menus
{

    /**
     * Constructor for objects of class CreditScreen.
     * 
     */
    
    public TeamScreen() 
    {
        prepare();
    } 

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        NextSlide next = new NextSlide();
        addObject(next,726,560);
    }
}
