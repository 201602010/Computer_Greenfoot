import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int score = 0;
    public int getScore() {
        return score;
    }
    private void eatWorm() {
        CrabWorld world = (CrabWorld) getWorld();
        Score counter = world.getScore();
        counter.bumpCount(-5);
    }
    public void act() 
    {
        // Add your action code here.
        moveAround();
        eat();
    }    
    public void moveAround() {
        move(2);
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (getX() <= 15 || getX() >= getWorld().getWidth() - 15)
        {
            turn(180);
        }
        if (getY() <= 15 || getY() >= getWorld().getHeight() - 25)
        {
            turn(180);
        }
    }
    public void eat() {
        Actor crab;
        crab = getOneObjectAtOffset(0, 0, Crab.class);
        if(crab != null) {
            World world;
            world = getWorld();
            world.removeObject(crab);
            GameOver();
        }
        
        Actor worm;
        worm = getOneObjectAtOffset(0, 0, Worm.class);
        if(worm != null) {
            World world;
            world = getWorld();
            world.removeObject(worm);
            eatWorm();
        }
    }
    private void GameOver() {
        GameOver gameOver = new GameOver();
        getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/3 );
        
        RestartButton restart = new RestartButton();
        getWorld().addObject(restart, getWorld().getWidth()/2, getWorld().getHeight()/3 + gameOver.getImage().getHeight() + 20 );
    }
}
