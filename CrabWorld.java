import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    private Score theScore;
    public Score getScore() {
        return theScore;
    }
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        theScore = new Score();
        addObject(theScore, 85, 25);
        start();
    }
    public void act() {
        int randomNumber = 1 + Greenfoot.getRandomNumber(119);
        int xLo = 50;
        int xHi = 510;
        int xlLo = 50;
        int xlHi = 510;
        int yLo = 75;
        int yHi = 510;
        int ylLo = 300;
        int ylHi = 510;
        int randomX = xLo + Greenfoot.getRandomNumber(xHi - xLo);
        int randomY = yLo + Greenfoot.getRandomNumber(yHi - yLo);
        int randomXL = xlLo + Greenfoot.getRandomNumber(xlHi - xlLo);
        int randomYL = ylLo + Greenfoot.getRandomNumber(ylHi - ylLo);
        int lobsterCount = 0;
        
        if (randomNumber > 0)
        {
            randomNumber--;
            if (randomNumber == 0)
            {
                if (getObjects(Worm.class).size() < 5)
                    addObject(new Worm(), randomX, randomY);
            }            
        }
        
        if (theScore.getScore() % 100 == 0 || theScore.getScore() % 100 == 5)
        {
            if (getObjects(Lobster.class).size() < theScore.getScore() / 50)
                addObject(new Lobster(), randomXL, randomYL);
        }
        if (theScore.getScore() % 50 == 0 || theScore.getScore() % 50 == 5)
        {
            if (getObjects(Turtle.class).size() < 1 && theScore.getScore() >=50)
                addObject(new Turtle(), randomXL, randomYL);
        }
        
    }
    private void start() {
        Crab crab = new Crab();
        addObject(crab, 280, 280);
        crab.setLocation(396, 75);
        Lobster lobster = new Lobster();
        addObject(lobster, 560, 560);
        lobster.setLocation(75, 396);
    }
}
