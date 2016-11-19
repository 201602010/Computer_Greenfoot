import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm extends Actor
{
    /**
     * Act - do whatever the Worm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int counter;
    
    public void Worm() {
        counter = 0;
    }
    public void act() 
    {
        // Add your action code here.
        counter++;
        removeWorm();
        // int randomNuber = 1 + Greenfoot.getRandomNumber(119);
    }    
    public void removeWorm() {
        if(counter >= 700) {
            getWorld().removeObject(this);
        }
    }
}
