import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal extends Actor
{
    public void randomTurn ()
    {
        if (isAtEdge())
        {
            turn(17);
        }
        if (Greenfoot.getRandomNumber(400) < 50)
        {
            turn(7);
        }
        else if (Greenfoot.getRandomNumber(400) < 50)
        {
            turn(-7);
        }
    }
    public void touchWorm (int score)
    {
        Actor worm;
        worm = getOneObjectAtOffset(0, 0, Worm.class);
        if (worm != null)
        {
            World world = getWorld();
            world.removeObject(worm);
            updateScore(score);
        }
    }
    public void updateScore(int amount)
    {
        CrabWorld world = (CrabWorld) getWorld();
        Score counter = world.getScore();
        counter.bumpCount (amount);
    }
}
