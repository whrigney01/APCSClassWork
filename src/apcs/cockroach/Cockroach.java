package apcs.cockroach;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.ArrayList;

public class Cockroach extends Actor {
    public static Location cornerTo;

    private Location oldLoc;

    public Cockroach() {
        this.setColor(null);
        this.setDirection((int) (Math.random() * 360));
        cornerTo = new Location(0,0);

    }

    public void act() {
        if (CockroachWorld.getLightsOff()) {
            scatter();
        } else {
            hide(0);
        }
    }

    public void setOldLoc(Location oldLoc) {
        this.oldLoc = oldLoc;
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
//        this.setColor(Color.RED);
        Location curLoc = this.getLocation();
        Grid gr = this.getGrid();


        int directToCorner = curLoc.getDirectionToward(cornerTo);
        Location nextLoc = curLoc.getAdjacentLocation(directToCorner + turnDirect);


        if(nextLoc.equals(oldLoc)){
            return;
        }

        if (gr.isValid(nextLoc) && gr.get(nextLoc) == null) {


            this.setDirection(curLoc.getDirectionToward(nextLoc));
            this.moveTo(nextLoc);
        } else {
            if (turnDirect == 0) {
                hide(45);
            } else if (turnDirect == 45) {
                hide(-45);
            } else if (turnDirect == -45) {
                hide(90);
            } else if (turnDirect == 90) {
                hide(-90);
            } else {
                return;
            }
        }
    }

    public void moveTo(Location nextLoc){
        oldLoc = this.getLocation();

        super.moveTo(nextLoc);
    }


}

