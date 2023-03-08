package apcs.cockroach;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.ArrayList;

public class Cockroach extends Actor {
    private Location cornerTo;
    public Cockroach() {
        this.setColor(null);
        this.setDirection((int) (Math.random() * 360));
    }

    public void act() {
        if (CockroachWorld.getLightsOff()) {
            scatter();
        } else {
            hide(0);
        }
    }

    public void scatter() {
        Location curLoc = this.getLocation();
        Grid gr = this.getGrid();
        this.setColor(Color.ORANGE);
        ArrayList<Location> emptyLocs = gr.getEmptyAdjacentLocations(curLoc);
        if (emptyLocs.size() == 0) {
            return;
        }
        Location nextRandLoc = emptyLocs.get((int) (Math.random() * emptyLocs.size()));
        int direct = curLoc.getDirectionToward(nextRandLoc);
        this.setDirection(direct);
        this.moveTo(nextRandLoc);
    }

    public void hide(int turnDirect) {
        this.setColor(Color.RED);
        Location curLoc = this.getLocation();
        Grid gr = this.getGrid();
        cornerTo = new Location(0,0);

        if(CockroachWorld.getToCorner() == 2){
            cornerTo = new Location(0, 39);
        }else if(CockroachWorld.getToCorner() == 3){
            cornerTo = new Location(19, 0);
        }else if(CockroachWorld.getToCorner() == 4){
            cornerTo = new Location(19, 39);
        }





        int directToCorner = curLoc.getDirectionToward(cornerTo);
        Location nextLoc = curLoc.getAdjacentLocation(directToCorner + turnDirect);

        if(gr.isValid(nextLoc) && gr.get(nextLoc) == null){
            this.setDirection(curLoc.getDirectionToward(nextLoc));
            this.moveTo(nextLoc);
        }else {
            if(turnDirect == 0) {
                hide(45);
            }else if(turnDirect == 45) {
                hide(-45);
            }else if(turnDirect == -45) {
                hide(90);
            }else if(turnDirect == 90) {
                hide(-90);
            }else{
                return;
            }
        }




    }
}
