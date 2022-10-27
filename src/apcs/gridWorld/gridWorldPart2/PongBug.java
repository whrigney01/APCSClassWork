package apcs.gridWorld.gridWorldPart2;

import info.gridworld.actor.Bug;

public class PongBug extends Bug {

    public PongBug (){
        this.setDirection(45);
    }

    public void act(){
        if(this.canMove() == false){
            this.setDirection(this.getDirection() + 90);
            if (this.canMove()){
                this.move();
            }else{
                this.setDirection((this.getDirection()-90) + 270);
            }
        }else{
            this.move();
        }
    }
}
