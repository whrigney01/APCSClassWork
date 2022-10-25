package apcs.gridWorld.gridWorldPart2;

import apcs.gridWorld.gridWorldPart2.CircleBug;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

public class Exercises {
    public static void main(String[] args) {
        UnboundedGrid<Actor> grid = new UnboundedGrid<>();
        ActorWorld world = new ActorWorld(grid);

        CircleBug circly = new CircleBug(2);
        world.add(new Location(10,0),circly);

        SpiralBug spiraly = new SpiralBug(2);
        world.add(new Location(30,30), spiraly);

        ZBug zy = new ZBug(4);
        world.add(new Location(10,40), zy);

        world.show();
    }
}
