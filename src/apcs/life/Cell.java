package apcs.life;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cell extends Actor {
    private int phase;
    private int lifeOrDeath;
    //1 = dead and 0 = life
    private ArrayList<Location> locs;

    public Cell() {
        phase = 1;


    }

    public void act() {
        if (this.phase == 1) {
            this.phase1();
            this.phase = 2;
        } else {
            this.phase2();
            this.phase = 1;
        }
    }

    public void phase1() {
        ArrayList<Actor> neighbors = this.getGrid().getNeighbors(this.getLocation());
        if (neighbors.size() == 2 || neighbors.size() == 3) {
            lifeOrDeath = 0;
        } else {
            lifeOrDeath = 1;
        }
        ArrayList<Location> emptyLocs = this.getGrid().getEmptyAdjacentLocations(this.getLocation());
        for (int i = 0; i < emptyLocs.size(); i++) {
            if(this.getGrid().getNeighbors(emptyLocs.get(i)).size() == 3){
                locs.add(emptyLocs.get(i));
            }
        }
    }

    public void phase2() {
        if(this.lifeOrDeath == 1) {
            this.removeSelfFromGrid();
        }

        for(int i = 0; i < locs.size(); i++){
            if(!(this.getGrid().get(locs.get(i)) instanceof Actor)){
                Cell c = new Cell();
                c.putSelfInGrid(this.getGrid(), locs.get(i));
            }


        }
    }
}
