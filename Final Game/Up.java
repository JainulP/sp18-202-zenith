import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Up here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Up extends Actor
{
    public Up(){
        GreenfootImage image = getImage();
        int scale = Math.max(image.getWidth(),image.getHeight());
        image.scale(image.getWidth()*50/scale, image.getHeight()*50/scale);
        setImage(image);
    }
    /**
     * Act - do whatever the Up wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
