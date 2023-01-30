package apcs.gw3;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;

public class ColorTester {
    public static void main (String[] args) {
        Grid<Actor> gr = new BoundedGrid<Actor>(15, 20);
        ActorWorld world = new ActorWorld (gr);
        world.add (new ColorBug ());
        world.show ();
    }
}
