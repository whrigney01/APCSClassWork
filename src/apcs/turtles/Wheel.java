package apcs.turtles;

import TurtleGraphics.Pen;

public class Wheel extends Circle{
    private int spokes;

    public Wheel(){
        super();
        this.spokes = 0;
    }

    public Wheel(double x, double y, double r, int s){
        super(x, y, r);
        this.spokes = s;
    }

    public int getSpokes() {
        return spokes;
    }

    public void setSpokes(int spokes) {
        this.spokes = spokes;
    }

    public void draw(Pen p){
        super.draw(p);

        for (int i = 0; i < spokes; i++) {
            p.move(getXPos(),getYPos());
            p.turn(360.0/(double)spokes + 180);
            p.move(getRadius());
        }

    }

    @Override
    public String toString() {
        return "Wheel: Center = (" + getXPos() + ", " + getYPos() + "); Radius = "+ getRadius() + "; Spokes: " + spokes + ";";
    }
}
