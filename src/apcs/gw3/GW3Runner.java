package apcs.gw3;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class GW3Runner {
    public static void main(String[] args) {
        Grid<Actor> g = new BoundedGrid<Actor>(20, 20);
        ActorWorld w = new ActorWorld (g);
        Actor bob = new Actor ();
        bob.putSelfInGrid (g, new Location(2,2));
        w.show();
    }
}

