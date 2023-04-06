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
        double ap = sideLength/(2*Math.tan(Math.toRadians(180.0/sides)));
        p.up();
        p.move(xPos,yPos);
        p.setDirection(90);
        p.move(xPos, yPos + ap);
        p.turn(90);
        p.move(sideLength/2);

        p.down();
        for (int i = 0; i < sides; i++) {
            p.turn(360.0/sides);
            p.move(sideLength);
        }
    }

    @Override
    public String toString() {
        return "regPolygon: Center = (" + xPos + ", " + yPos + "); Sides = "+ sides + "; Radius = " + radius +"; Side Length: " + sideLength + ";";
    }
}
