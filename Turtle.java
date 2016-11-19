import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor implements Freezable
{
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (counter >= 250) {
            moveAround(2);
        }
        else if(counter < 0) {
            freeze(500);
        }
        counter--;
        eat();
    }    
    public void moveAround(int speed) {
        move(speed);
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
        Actor lobster;
        lobster = getOneObjectAtOffset(0, 0, Lobster.class);
        if(lobster != null) {
            World world;
            world = getWorld();
            world.removeObject(lobster);
        }
    }
    private int counter;
    public Turtle() {
        counter = 100;
    }
    public void freeze(int count) {
        counter = count;
    }
}
