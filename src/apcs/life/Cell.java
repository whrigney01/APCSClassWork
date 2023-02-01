//Extension: Created a way to enter cords in a txt file that then will be placed on the grid. This code also ignores any not int characters that will cause an error.

package apcs.life;


import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.ArrayList;

public class Cell extends Actor {
    private int phase;
    private boolean isDied;
    private ArrayList<Location> newLocs;

    public Cell() {
        phase = 1;
        newLocs = new ArrayList<>();
    }

    public void act() {
        if (this.phase == 1) {
            this.phase1();
            this.phase = 2;
        } else if (this.phase == 2) {
            this.phase2();
            this.phase = 1;
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
                newLocs.add(emptyLocs.get(i));
            }
        }
    }

    public void phase2() {
        Grid<Actor> gr = this.getGrid();
        if (this.isDied) {
            //This is the mutation code but I wanted to see glider gun so commented out
//            if((int)(Math.random() * 200) != 1) {
                this.removeSelfFromGrid();
//            }
        }
        for (int i = 0; i < newLocs.size(); i++) {
            if (!(gr.get(newLocs.get(i)) instanceof Cell)) {
                Cell c = new Cell();
                c.putSelfInGrid(gr, newLocs.get(i));
            }
        }
        newLocs = new ArrayList<>();
    }
}

