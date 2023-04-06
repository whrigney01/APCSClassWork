package apcs.turtles;

import TurtleGraphics.Pen;

public class Rect implements Shape{
    private double xPos;
    private double yPos;
    private double height;
    private double width;

    public Rect(){
        this.xPos =0;
        this.yPos = 0;
        this.height = 1.0;
        this.width = 1.0;
    }

    public Rect(double x, double y, double h, double w){
        this.xPos = x;
        this.yPos = y;
        this.height = h;
        this.width = w;
    }

    @Override
    public double getXPos() {
        return this.xPos;
    }

    @Override
    public double getYPos() {
        return this.yPos;
    }

    @Override
    public void move(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public void stretchBy(double factor) {
        height = height * factor;
        width = width * factor;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos+width/2,yPos+height/2);
        p.down();
        p.move(xPos-width/2,yPos+height/2);
        p.move(xPos-width/2,yPos-height/2);
        p.move(xPos+width/2,yPos-height/2);
        p.move(xPos+width/2,yPos+height/2);
    }

    @Override
    public String toString() {
        return "Rect: Center = (" + xPos + ", " + yPos + "); Height = "+ height + "; Width = " + width +";";
    }

    public double getWidth() {

        return width;
    }
}
