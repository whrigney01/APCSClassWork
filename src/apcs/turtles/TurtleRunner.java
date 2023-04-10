package apcs.turtles;

import TurtleGraphics.*;

public class TurtleRunner {
    public static void main(String[] args) {
        SketchPadWindow sk = new SketchPadWindow(500,500);
        SlowPen pen = new SlowPen(100);

        SketchPadWindow sk2 = new SketchPadWindow(500,500);
        StandardPen p2 = new WigglePen(sk);

        SketchPadWindow sk3 = new SketchPadWindow(500,500);
        StandardPen p3 = new RainbowPen(sk);

        SketchPadWindow sk4 = new SketchPadWindow(500,500);
        StandardPen p4 = new WiggleRainbowPen(sk);

        pen.up();
        pen.move(25);
        pen.turn(90);
        pen.move(25);
        pen.down();
        pen.turn(90);
        for (int i = 0; i < 4; i++) {
            pen.move(50);
            pen.turn(90);
        }

        p2.up();
        p2.move(25);
        p2.turn(90);
        p2.down();
        p2.move(25);
        p2.turn(120);
        p2.move(50);
        p2.turn(120);
        p2.move(50);
        p2.turn(120);
        p2.move(25);


        p3.up();
        p3.move(25);
        p3.turn(162);
        p3.down();
        for (int i = 0; i < 5; i++) {
            p3.move(50);
            p3.turn(144);
        }

        p4.up();
        p4.move(25);
        p4.turn(90);
        p4.move(25);
        p4.turn(60);
        p4.down();
        for (int i = 0; i < 6; i++) {
           p4.move(50);
           p4.turn(60);
        }
    }
}
