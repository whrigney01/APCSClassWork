package apcs.cockroach;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cockroach extends Actor {
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


        int directToCorner = curLoc.getDirectionToward(new Location(0, 0));
        Location nextLoc = curLoc.getAdjacentLocation(directToCorner + turnDirect);

        if(gr.isValid(nextLoc) && gr.get(nextLoc) == null){
            this.setDirection(curLoc.getDirectionToward(nextLoc));
            this.moveTo(nextLoc);
        }else {
            hide(45);
        }


        }

    }
}
