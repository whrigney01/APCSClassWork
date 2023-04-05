package apcs.turtles;

import TurtleGraphics.Pen;

public class regPolygon implements Shape{
    private double xPos;
    private double yPos;
    private double sides;
    private double radius;

    private double sideLength;

    public regPolygon(){
        this.xPos =0;
        this.yPos = 0;
        this.sides = 3.0;
        this.radius = 1.0;
        this.sideLength = 1.0;
    }

    public regPolygon(double x, double y, double h, double w, double l){
        this.xPos = x;
        this.yPos = y;
        this.sides = h;
        this.radius = w;
        this.sideLength = l;
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
        radius = radius * factor;
        sideLength *= factor;
    }

    @Override
    public double area() {
        return (sides/2) * 50 * radius;
    }

    @Override
    public void draw(Pen p) {
        p.down();
        p.setDirection(90);
        p.move(xPos, yPos + radius);
        p.down();
        p.setDirection((360/sides *2 + 90));
        for (int i = 0; i < sides; i++) {
            p.move(sideLength);
            p.turn(180 - (sides - 2) * 180 / sides );
        }
    }

    @Override
    public String toString() {
        return "regPolygon: Center = (" + xPos + ", " + yPos + "); Sides = "+ sides + "; Radius = " + radius +";";
    }
}
