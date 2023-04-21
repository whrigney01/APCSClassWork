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
        drawTree(p2, length / 2.0 , 0, 30.0);


    }

    public static void drawTree(Pen p, double length, int degree, double turn){
        if(degree == 0){
            p.move(length);
            p.turn(turn);
            p.move(length/1.5);
            p.move(-length/1.5);
            p.turn(-turn * 2);
            p.move(length/1.5);
            p.move(-length/1.5);
            p.turn(-turn);
            p.move(-length);
        }else{
            p.move(length);
            p.turn(turn);
            p.move(length/1.5);
            drawTree(p, length/1.5,degree - 1, turn/1.5);
            p.move(-length/1.5);
            p.turn(-turn * 2);
            p.move(length/1.5);
        }

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
