import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int score = 0;
    public int getScore() {
        return score;
    }
    private void eatWorm() {
        CrabWorld world = (CrabWorld) getWorld();
        Score counter = world.getScore();
        counter.bumpCount(10);
    }
    public void act() 
    {
        // Add your action code here.
        moveAndTurn();
        eat();
    }
    public void moveAndTurn() {
        /*
        if (isAtEdge()) {
            turn(17);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            turn(4);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(-4);
        }
        move(5);
        */
       if (Greenfoot.isKeyDown("w"))
        {
            move(3);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            move (-3);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turn(3);
        }
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-3);
        }
    }
    public void eat() {
        Actor worm;
        worm = getOneObjectAtOffset(0, 0, Worm.class);
        if(worm!=null) {
            World world;
            world = getWorld();
            world.removeObject(worm);
            eatWorm();
        }
    }
}
