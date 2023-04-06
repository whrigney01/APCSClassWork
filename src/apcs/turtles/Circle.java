package apcs.turtles;

import TurtleGraphics.Pen;

import java.awt.*;

public class Circle implements Shape {

    private double xPos;
    private double yPos;
    private double radius;

    public Circle(){
        this.xPos =0;
        this.yPos = 0;
        this.radius = 1.0;
    }

    public Circle(double x, double y, double h){
        this.xPos = x;
        this.yPos = y;
        this.radius = h;
    }

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
        radius = radius * factor;
    }

    @Override
    public double area() {
        return Math.PI * (radius*radius);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos,yPos+radius);
        p.setDirection(90);
        p.turn(90);
        p.down();
        for (int i = 0; i < 120; i++) {
            p.move(((2*Math.PI*radius)/120));
            p.turn(360/120);
        }
    }

    @Override
    public String toString() {
        return "Circle: Center = (" + xPos + ", " + yPos + "); Radius = "+ radius + ";";
    }
}