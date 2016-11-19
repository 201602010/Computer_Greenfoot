import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Animal
{
    private boolean gameover = false;
    public void act() 
    {
        if (!gameover)
        {
            turn();
            move(3);
            touchWorm(10);
            touchLobster();
        }
    }
    public void touchLobster ()
    {
        if (isTouching (Lobster.class))
        {
            World world;
            world = getWorld();
            gameover = true;
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/3 );
        
            RestartButton restart = new RestartButton();
            getWorld().addObject(restart, getWorld().getWidth()/2, getWorld().getHeight()/3 + gameOver.getImage().getHeight() + 20 );
        }
    }
}
