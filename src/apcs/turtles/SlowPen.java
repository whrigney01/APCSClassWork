package apcs.turtles;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;

public class SlowPen extends StandardPen {
    private int delay;
    public SlowPen(int delay) {
        super();
        this.delay = delay;
    }

    public SlowPen(SketchPadWindow sk, int delay) {
        super(sk);
        this.delay = delay;
    }

    public void move(double dist){
        try{
            Thread.sleep(this.delay);
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        super.move(dist);
    }
}
