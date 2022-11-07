package apcs.gridWorld.ZigZagBug;

import info.gridworld.actor.Bug;

public class ZigZagBug extends Bug {
    private int steps;
    private boolean isTurningRight = true;
    private int sideLength;
    public ZigZagBug (int steps){
        this.sideLength = steps;
        this.steps = 0;
    }

    public void act(){
        if (steps < sideLength){
            move();
            steps++;
        }else{
            if(isTurningRight){
                turn();
                turn();
                isTurningRight = false;
            }else {
                turn();
                turn();
                turn();
                turn();
                turn();
                turn();
                isTurningRight = true;
            }
            steps = 0;
        }
    }
}
