package apcs.turtles;

import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;

public class ShapeRunner {
    public static void main (String[] args) {
        SketchPadWindow sk = new SketchPadWindow (500, 500);
        StandardPen p1 = new StandardPen (sk);

        Rect r1 = new Rect (0.0, 0.0, 10.0, 20.0);

        r1.draw (p1);
        r1.stretchBy (10.0);
        r1.draw (p1);
        r1.move (100.0, 100.0);
        r1.draw (p1);
        p1.up();
        p1.move(-100, -100);
        p1.drawString(""+r1);
        p1.move(-100, -115);
        p1.drawString(""+r1.area());

        SketchPadWindow sk2 = new SketchPadWindow (500, 500);
        StandardPen p2 = new StandardPen (sk2);

        Circle c1 = new Circle (0.0, 0.0, 10.0);

        c1.draw (p2);
        c1.stretchBy (10.0);
        c1.draw (p2);
        c1.move (100, 100);
        c1.draw (p2);
        p2.up();
        p2.move(-100, -100);
        p2.drawString(""+c1);
        p2.move(-100, -115);
        p2.drawString(""+c1.area());

        SketchPadWindow sk3 = new SketchPadWindow (500, 500);
        StandardPen p3 = new StandardPen (sk3);

        regPolygon r = new regPolygon (0.0, 0.0,6.0 ,10.0, 10.0);

        r.draw (p3);
        r.stretchBy (10.0);
        r.draw (p3);
        r.move (100, 100);
        r.draw (p3);
        p3.up();
        p3.move(-100, -100);
        p3.drawString(""+r);
        p3.move(-100, -115);
        p3.drawString(""+r.area());
    }



}
