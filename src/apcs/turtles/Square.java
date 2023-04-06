package apcs.turtles;

import TurtleGraphics.Pen;

public class Square extends Rect{
    public Square(){
        super();
    }

    public Square(double x, double y, double sideLength){
        super(x,y,sideLength,sideLength);
    }

    @Override
    public void draw(Pen p) {
        super.draw(p);
    }

    @Override
    public String toString() {
        return "Square: Center(" + getXPos() +", " + getYPos() +"); Side Length: " + getWidth() + ";";
    }
}
