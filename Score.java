import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static final Color TRANSPARENT = new Color(0,0,0,0);
    private int value;
    private Color textColor = Color.black;
    
    private int score = 0;
    public int getScore() {
        return score;
    }
    public Score() {
        updateImage();
    }
    private void updateImage() {
        int fontSize = 24;
        setImage(new GreenfootImage("Score : "+score, fontSize, textColor, TRANSPARENT));
    }
    public void setTextColor(Color color) {
        textColor = color;
        updateImage();
    }
    public int getValue() {
        return value;
    }
    public void act(int amount) 
    {
        // Add your action code here.
        value += amount;
        updateImage();
    }    
    public void theScore() {
        CrabWorld world = (CrabWorld) getWorld();
    }
    public void bumpCount(int amount) {
        score += amount;
        updateImage();
    }
}
