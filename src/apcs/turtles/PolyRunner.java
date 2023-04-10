package apcs.turtles;

import TurtleGraphics.Pen;

import java.util.ArrayList;

public class PolyRunner {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Rect (-10.0, 10.0, 20.0, 20.0));
        shapes.add(new Circle (10.0, 10.0, 10.0));
        shapes.add(new Wheel (10.0, -10.0, 10.0, 6));
        Pen p = new SlowPen (10);
        for (Shape s: shapes) {
            s.draw(p);
            System.out.println(s);
        }
        }
}
