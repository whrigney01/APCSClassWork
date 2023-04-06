package apcs.turtles;

import TurtleGraphics.Pen;

public class DartBoard extends Circle{
    public DartBoard() {
        super();
    }

    public DartBoard(double x, double y, double h) {
        super(x, y, h);
    }

    public void draw(Pen p){
        super.draw(p);
        for (int i = 0; i < 3; i++) {
            Circle circ = new Circle(getXPos(), getYPos(), getRadius() *  (.75 - (.25 * i)));
            circ.draw(p);
        }


    }

    @Override
    public String toString() {
        return "Dartboard: Center: (" + getXPos() +", " + getYPos() + "); Radius: " + getRadius() +";";
    }
}
