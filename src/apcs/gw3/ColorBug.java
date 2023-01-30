package apcs.gw3;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.ArrayList;

public class ColorBug extends Bug {
    public void act(){
        Location loc = this.getLocation();
        Grid gr = this.getGrid();
        ArrayList<Actor> neighbors = gr.getNeighbors(loc);
        int numNeighbors = neighbors.size();
        if(numNeighbors == 1 || numNeighbors == 0){
            this.setColor(Color.BLUE);
        }else if(numNeighbors == 2 || numNeighbors == 3){
            this.setColor(Color.CYAN);
        }else{
            this.setColor(Color.GREEN);
        }
        ArrayList<Location> emptyAdj= gr.getEmptyAdjacentLocations(loc);
        if(emptyAdj .size()!= 0) {
            int randNum = (int) (Math.random() * emptyAdj.size());
            System.out.println(randNum);
            Location newLoc = emptyAdj.get(randNum);
            int direct = loc.getDirectionToward(newLoc);
            this.setDirection(direct);
            this.move();
        }else{
            this.turn();
        }

    }
}
