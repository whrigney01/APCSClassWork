


package apcs.life;


import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.ArrayList;

public class Cell extends Actor {
    private int phase;
    private int birthRule;
    private int liveRule;
    private int liveRule2;
    private boolean isDied;
    private ArrayList<Location> newLocs;

    public Cell(int birthRule, int liveRule, int liveRule2) {
        phase = 1;
        newLocs = new ArrayList<>();
        this.setColor(Color.GRAY);
        this.birthRule = birthRule;
        this.liveRule2 = liveRule2;
        this.liveRule = liveRule;
    }
    public Cell(){
        phase = 1;
        newLocs = new ArrayList<>();
        this.setColor(Color.GRAY);
        this.birthRule = 3;
        this.liveRule2 = 2;
        this.liveRule = 3;
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
        Location loc = this.getLocation();

        if (gr.getNeighbors(loc).size() == liveRule || gr.getNeighbors(loc).size() == liveRule2) {
                isDied = false;

        } else {
            isDied = true;
        }
        ArrayList<Location> emptyLocs = gr.getEmptyAdjacentLocations(loc);
        for (int i = 0; i < emptyLocs.size(); i++) {
            if (gr.getNeighbors(emptyLocs.get(i)).size() == birthRule) {
                newLocs.add(emptyLocs.get(i));
            }
        }
    }

    public void phase2() {
        Grid<Actor> gr = this.getGrid();
        Location loc = this.getLocation();
        if (this.isDied) {
            //This is the mutation code, but I wanted to see glider gun so commented out
//            if((int)(Math.random() * 200) != 1) {
                this.removeSelfFromGrid();
//            }
        }
        for (int i = 0; i < newLocs.size(); i++) {
            if (!(gr.get(newLocs.get(i)) instanceof Cell)) {
                Cell c = new Cell(birthRule, liveRule, liveRule2);
                c.putSelfInGrid(gr, newLocs.get(i));
            }
        }
        newLocs = new ArrayList<>();
    }
}

