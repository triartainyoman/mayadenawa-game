import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends Menus
{

    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    static GreenfootSound winSound = new GreenfootSound("menang.wav");
     
    public WinScreen()
    {
        prepare();
        winSound.playLoop();
    }
    private void prepare()
    {
        Level1.life.setValue(Level1.life.getValue());
        addObject(Level1.life,300,270);

        Level1.score.setValue(Level1.score.getValue());
        addObject(Level1.score,500,270);
        BtnWin btnWin = new BtnWin();
        addObject(btnWin,401,144);
    }
}
