package apcs.gridWorld.gridWorldPart2;

import apcs.gridWorld.gridWorldPart2.CircleBug;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

public class Exercises {
    //Extension: I made an infinite ZBug, a PongBug and a DancingBug that goes forward a random amount of times.
    //This extension extended my thinking because it forced me to use other java concepts such as for loops and if elses as well as other OOP concects such as methods while still staying in the project theme of class hierarchies.
    public static void main(String[] args) {
        BoundedGrid<Actor> grid = new BoundedGrid<>(60,70);
        ActorWorld world = new ActorWorld(grid);

        CircleBug circly = new CircleBug(2);
        world.add(new Location(10,0),circly);

        SpiralBug spiraly = new SpiralBug(2);
        world.add(new Location(30,30),   spiraly);

        ZBug zy = new ZBug(10);
        world.add(new Location(10,30), zy);

        DancingBug dancy = new DancingBug();
        world.add(new Location(10, 30), dancy);

        PongBug pongy = new PongBug();
        world.add(new Location(20, 10), pongy);

        world.show();
    }
}
