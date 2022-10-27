package apcs.gridWorld.gridWorldPart2;

import info.gridworld.actor.Bug;

public class ZBug extends Bug {
    private int steps;
    private int sideLength;

    boolean isZDone = false;
    boolean is2ZDone = false;
    boolean isBug = false;
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
            if (isZDone == false) {
                for (int i = 0; i < 3; i++) {
                    this.turn();
                }
                this.steps = 0;
                isZDone = true;
            }else{
                for (int i = 0; i < 4; i++){
                    this.turn();
                }
                this.steps = 0;
            }
        }
        else if (this.getDirection() == 225 && steps == sideLength){
            for (int i = 0; i < 5; i++){
                this.turn();
            }
            this.steps = 0;
        }
        else if (this.getDirection() == 270 && steps == sideLength && isBug == false){
              this.turn();
              this.turn();
              this.turn();
              this.steps = 0;
              isBug = true;
        }
        else if (this.getDirection() == 45 && steps == sideLength){
            this.turn();
            this.turn();
            this.turn();
            this.turn();
            this.turn();
            this.steps = 0;
            is2ZDone = true;


        }else if(this.getDirection() == 270 && steps == sideLength && is2ZDone == true){
            this.turn();
            this.turn();
            this.turn();
            this.turn();
            this.steps = 0;
            is2ZDone = false;
            isZDone = false;
            isBug = false;
        }
    }
}
