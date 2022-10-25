package apcs.gridWorld.gridWorldPart2;
import info.gridworld.actor.Bug;

public class SpiralBug extends Bug {
    private int steps;
    private int sideLength;


    public SpiralBug(int length) {
        this.steps = 0;
        this.sideLength = length;
    }
    public void act(){
        if (this.steps < this.sideLength && this.canMove()){
            this.move();
            this.steps++;
        }
        else {
            this.turn();
            this.turn();
            this.sideLength++;
            this.steps = 0;
        }
    }
}
