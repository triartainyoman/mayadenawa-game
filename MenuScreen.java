import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuScreen extends Menus
{

    /**
     * Constructor for objects of class MenuScreen.
     * 
     */
    static GreenfootSound menuSound = new GreenfootSound("menu.wav");
    
    public MenuScreen()
    {
        Level1.level1Sound.stop();
        menuSound.playLoop();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BtnInfo btnInfo = new BtnInfo();
        addObject(btnInfo,46,43);
        
        BtnPlay btnPlay = new BtnPlay();
        addObject(btnPlay,400,370);
    }
}
