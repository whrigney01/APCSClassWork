package apcs.gridWorld.gridWorldPart2;

import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
    private int randNum;
    private int randNum2;

    public void act() {
        randNum = (int)(Math.random() * 5 + 1);
        randNum2 = (int)(Math.random() * 6 + 1);
        if (randNum2 <= 5){
            this.movement(randNum2);
        }

        if (randNum == 1) {
            this.turn();
            this.turn();
            this.turn();
            this.turn();
            this.turn();
            this.turn();

        } else if (randNum == 2) {
            this.turn();
            this.turn();
            this.turn();
            this.turn();
            this.turn();
            this.turn();
            this.turn();

        } else if (randNum == 3) {

        } else if (randNum == 4) {
            this.turn();

        } else if (randNum == 5) {
            this.turn();
            this.turn();

        }
    }

    public void movement(int times){
        for(int i = 0; i < times; i++){
            if(this.canMove()){
                this.move();
            }
        }

    }
}
