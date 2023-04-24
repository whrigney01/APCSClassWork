package apcs.turtles;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;



public class KochRunner {
    public static void main(String[] args) {
        SketchPadWindow sk = new SketchPadWindow (500, 500);
        Pen p = new StandardPen(sk);
        double length = 400.0;
        int degree = 4;
        p.up();
        p.move(.5 * Math.sqrt(3) * (length/3.0));
        p.setDirection(0);
        p.move(-length/2.0);
        p.down();
        drawKochCurve(p, length, degree);
        p.turn(-120);
        drawKochCurve(p, length, degree);
        p.turn(-120);
        drawKochCurve(p, length, degree);


        //Tree Moment
        SketchPadWindow sk2 = new SketchPadWindow(500, 500);
        SlowPen p2 = new SlowPen(sk2, 10);
         drawTree(p2, 0 ,0, Math.PI/2, 100, 10);


    }

    public static void drawTree(Pen p, double x, double y, double angle, double length, int degree){
        if (degree == 0) {
           return;
        }

        double y2 = y + length * Math.sin(angle);
        double x2 = x + length * Math.cos(angle);

        p.up();
        p.move(x,y);
        p.down();
        p.move(x2, y2);

        drawTree(p, x2, y2, angle - Math.PI/4, length / 1.5, degree - 1);
        drawTree(p, x2, y2, angle + Math.PI/4, length / 1.5, degree - 1);
    }

    public static void drawKochCurve(Pen p, double length, int degree){
        if(degree == 0){
            p.move(length);
        }else{
            drawKochCurve(p, length/3.0, degree -1);
            p.turn(60);
            drawKochCurve(p, length/3.0, degree -1);
            p.turn(-120);
            drawKochCurve(p, length/3.0, degree -1);
            p.turn(60);
            drawKochCurve(p, length/3.0, degree -1);
        }
    }
}
