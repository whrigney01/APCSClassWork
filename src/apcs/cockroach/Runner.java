package apcs.cockroach;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

public class Runner {
    public static void main(String[] args) {
        BoundedGrid<Actor> gr = new BoundedGrid<Actor> (20, 40);
        CockroachWorld world = new CockroachWorld(gr);
        for (int i = 0; i < 40; i++) {
            int row = (int)(Math.random() * 20);
            int col = (int)(Math.random() * 40);
            world.add(new Location(row, col), new Rock());
        }

        for (int i = 0; i < 15; i++) {
            int row = (int)(Math.random() * 20);
            int col = (int)(Math.random() * 40);
            world.add(new Location(row, col), new Cockroach());
        }

        world.show();
    }
}
