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
            touchWorm(300);
            touchLobster();
        }
    }
    public void touchLobster ()
    {
        if (isTouching (Lobster.class))
        {
            World world = getWorld();
            gameover = true;
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/3 );
        
            RestartButton restart = new RestartButton();
            getWorld().addObject(restart, getWorld().getWidth()/2, getWorld().getHeight()/3 + gameOver.getImage().getHeight() + 20 );
        }
    }
    public void turn ()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            this.turn (-4);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            this.turn (4);
        }
        super.randomTurn();
    }
    public void gameWin ()
    {
        World world = getWorld();
        gameover = true;
        RestartButton restart = new RestartButton();
        world.showText("You Win!", world.getWidth()/2, world.getHeight()/3 - 40);
        world.addObject(restart, world.getWidth()/2, world.getHeight()/3 + 20);
    }
}
