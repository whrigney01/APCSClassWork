package apcs.turtles;

import TurtleGraphics.SketchPadWindow;

public class ZigzagRunner {
    public static void main (String [] args) {
        SketchPadWindow sk = new SketchPadWindow (800, 800);
        SlowPen p = new SlowPen (100);
        zigzag (p, 150);
    }

    public static void zigzag(SlowPen p, int dist) {
        if (dist == 0) {
            return;
        }
        else {
            p.move(dist);
            p.turn(183);
            p.move(dist - 1);
            p.turn(177);
            zigzag(p, dist - 2);
        }
    }
}
