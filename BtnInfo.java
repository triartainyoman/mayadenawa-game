import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class BtnInfo extends Buttons
{
    /**
     * Act - do whatever the BtnPlay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("enter"))
        {
            // MenuScreen.menuSound.stop();
            Greenfoot.setWorld(new InfoScreen());
            Greenfoot.playSound("klik.wav");
        }
    }     
}
