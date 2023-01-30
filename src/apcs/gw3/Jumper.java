package apcs.gw3;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;

public class Jumper extends Bug {

    public Jumper(){
        this.setColor(Color.GREEN);
    }
    public void act(){
        Location loc = this.getLocation();
        int direct = this.getDirection();
        Grid<Actor> gr = this.getGrid();
        Location loc2 = loc.getAdjacentLocation(direct).getAdjacentLocation(direct);
        boolean nextDetermined = false;

        while(!nextDetermined){
            if(!gr.isValid(loc2) || (!(gr.get(loc2) instanceof Rock) && !(gr.get(loc2) instanceof Bug))){
                nextDetermined = true;
            }else{
                loc2 = loc2.getAdjacentLocation(direct);
            }
        }
        if(gr.isValid(loc2)){
            this.moveTo(loc2);
        }else{
            this.setDirection(this.getDirection() + 45 );
        }

    }
}
