package apcs.life;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cell extends Actor {
    private int phase;
    private boolean isDied;

    private ArrayList<Location> locs;

    public Cell() {
        phase = 1;
        locs = new ArrayList<Location>();

    }

    public void act() {
        if (this.phase == 1) {
            this.phase = 2;
            this.phase1();
        } else if(this.phase == 2){
            this.phase = 1;
            this.phase2();
        }
    }

    public void phase1() {
        Grid<Actor> gr = this.getGrid();

        if (gr.getNeighbors(this.getLocation()).size() == 2 || gr.getNeighbors(this.getLocation()).size() == 3) {
            isDied = false;
        } else {
            isDied = true;
        }
        ArrayList<Location> emptyLocs = gr.getEmptyAdjacentLocations(this.getLocation());
        for (int i = 0; i < emptyLocs.size(); i++) {
            if (gr.getNeighbors(emptyLocs.get(i)).size() == 3) {

                locs.add(emptyLocs.get(i));
            }
        }
    }

    public void phase2() {
        Grid<Actor> gr = this.getGrid();
        if (this.isDied) {
            this.removeSelfFromGrid();
        } else {

            for (int i = 0; i < locs.size(); i++) {
                if (!(gr.get(locs.get(i)) instanceof Actor)) {
                    Cell c = new Cell();
                    c.putSelfInGrid(gr, locs.get(i));
                }
            }

        }
    }
}
