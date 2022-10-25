package apcs.gridWorld.gridWorldPart2;

import info.gridworld.actor.Bug;

public class ZBug extends Bug {
    private int steps;
    private int sideLength;


    public ZBug(int length) {
        this.steps = 0;
        this.sideLength = length;
        this.setDirection(90);
    }
    public void act(){
        if (this.steps < this.sideLength && this.canMove()){
            this.move();
            this.steps++;
        }
        else if (this.getDirection() == 90 && steps == sideLength) {
            for (int i = 0; i < 3; i++){
                this.turn();
            }
            this.steps = 0;
        }
        else if (this.getDirection() == 225 && steps == sideLength){
            for (int i = 0; i < 5; i++){
                this.turn();
            }
            this.steps = 0;
        }
    }
}
