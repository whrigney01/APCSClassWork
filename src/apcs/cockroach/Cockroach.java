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
            hide();
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

    public void hide() {
        Location curLoc = this.getLocation();
        Grid gr = this.getGrid();
        this.setColor(Color.RED);
        int direct = curLoc.getDirectionToward(new Location(0, 0));
        Location nextLoc = curLoc.getAdjacentLocation(direct);
        if (this.getLocation() != new Location(0, 0)) {
            if (gr.isValid(nextLoc)) {
                if (gr.get(nextLoc) == null) {
                    this.setDirection(direct);
                    this.moveTo(nextLoc);
                } else {
                    Location nextLoc2 = curLoc.getAdjacentLocation(this.getDirection() + 45);
                    if (gr.isValid(nextLoc2)) {
                        if (gr.get(nextLoc2) == null) {
                            this.setDirection(curLoc.getDirectionToward(nextLoc2));
                            this.moveTo(nextLoc2);
                        }
                    } else {
                        Location nextLoc3 = curLoc.getAdjacentLocation(this.getDirection() - 45);
                        if (gr.isValid(nextLoc3)) {
                            if (gr.get(nextLoc3) == null) {
                                this.setDirection(curLoc.getDirectionToward(nextLoc3));
                                this.moveTo(nextLoc3);
                            }
                        }
                    }
                }
            }
        }

    }
}
