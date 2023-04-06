package apcs.turtles;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;

public class ShapeRunner2 {
    public static void main (String[] argv) {
        SketchPadWindow sk = new SketchPadWindow (500, 500);
        Pen p1 = new StandardPen(sk);
        Wheel w1 = new Wheel (0.0, 0.0, 10.0, 7);
        w1.draw (p1);
        w1.stretchBy (10.0);
        w1.draw (p1);
        w1.move (100.0, 100.0);
        w1.draw (p1);

        p1.up();
        p1.move(-100, -120);
        p1.drawString(""+w1);
        p1.move(-100, -135);
        p1.drawString(""+w1.area());


        SketchPadWindow sk2 = new SketchPadWindow (500, 500);
        Pen p2 = new StandardPen(sk2);
        Square w2 = new Square (0.0, 0.0, 10.0);
        w2.draw (p2);
        w2.stretchBy (10.0);
        w2.draw (p2);
        w2.move (100.0, 100.0);
        w2.draw (p2);

        p2.up();
        p2.move(-100, -120);
        p2.drawString(""+w2);
        p2.move(-100, -135);
        p2.drawString(""+w2.area());

        SketchPadWindow sk3 = new SketchPadWindow (500, 500);
        Pen p3 = new StandardPen(sk3);
        DartBoard w3 = new DartBoard (0.0, 0.0, 10.0);
        w3.draw (p3);
        w3.stretchBy (10.0);
        w3.draw (p3);
        w3.move (100.0, 100.0);
        w3.draw (p3);

        p3.up();
        p3.move(-100, -120);
        p3.drawString(""+w3);
        p3.move(-100, -135);
        p3.drawString(""+w3.area());

    }

}
