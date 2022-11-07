package apcs.gridWorld.ZigZagBug;

import apcs.gridWorld.BoxBug;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;

public class ZigZagRunner {
    public static void main(String[] args) {
        BoundedGrid<Actor> grid = new BoundedGrid<>(20, 40);
        ActorWorld world = new ActorWorld(grid);

        ZigZagBug ziggy = new ZigZagBug(5);
        world.add (ziggy);

        world.show();

    }
}
