package apcs.turtles;

import TurtleGraphics.SketchPadWindow;

public class SpiralRunner {
    public static void main (String [] args) {
        SketchPadWindow sk = new SketchPadWindow (800, 800);
        SlowPen p = new SlowPen (100);
        spiral (p, 150);
    }

    public static void spiral(SlowPen p, int dist) {
        if (dist == 0) {
            return;
        }
        else {
            p.move(dist);
            p.turn(45);
            spiral(p, dist - 1);
        }
    }



}
