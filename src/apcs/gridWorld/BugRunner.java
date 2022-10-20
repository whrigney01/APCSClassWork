package apcs.gridWorld;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;


public class BugRunner {
    public static void main(String[] args) {
        BoundedGrid<Actor> grid = new BoundedGrid<>(20, 40);
        ActorWorld world = new ActorWorld(grid);


        Location loc = new Location(2,5);
        Bug buggy = new Bug();
        world.add(buggy);
        Rock rocky = new Rock();
        world.add(new Location(5,2), rocky);


        world.show();
    }
}
