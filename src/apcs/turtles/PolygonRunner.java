package apcs.turtles;

import TurtleGraphics.SketchPadWindow;

public class PolygonRunner {
    public static void main (String [] args) {
        SketchPadWindow sk = new SketchPadWindow (800, 800);
        SlowPen p = new SlowPen (100);
        Polygon(p, 150, 5, 5);
        double ap = 150/(2*Math.tan(Math.toRadians(180.0/5)));
        p.up();
        p.setDirection(90);
        p.move(0,0 + ap);
        p.turn(90);
        p.move(150/2);

        p.down();
    }

    public static void Polygon(SlowPen p, int dist, int sides, int sides2) {
        if (sides2 == 0) {
            return;
        }
        else {
            p.turn(360.0/sides);
            p.move(dist);
            Polygon(p, dist, sides, sides2 - 1);

        }
    }
}
