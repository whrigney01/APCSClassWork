package apcs.gw3;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import java.util.Arrays;

public class GW3 {
    public static void main(String[] args) {
        Location loc = new Location (3, 4);
        System.out.println (loc);
        System.out.println (loc.getAdjacentLocation(Location.NORTH));
        System.out.println (loc.getDirectionToward(new Location (2, 2)));
        System.out.println (loc.compareTo(new Location (1, 3)));


        BoundedGrid<String> g = new BoundedGrid<String>(10,10);
        g.put(new Location (1, 2), "test 1");
        g.put(new Location (2, 1), "test 2");
        System.out.println (g);
        ArrayList<Location> locs = g.getOccupiedLocations();
        System.out.println (locs);



        System.out.println("List of valid locations around (3,3): " + g.getValidAdjacentLocations(new Location(3,3)));

        System.out.println("List of valid locations around (0,3): " + g.getValidAdjacentLocations(new Location(0,3)));

        System.out.println("List of occupied locations around (2,2): " + g.getOccupiedAdjacentLocations(new Location(2,2)));

        System.out.println("List of occupied locations around (2,2): " + g.getEmptyAdjacentLocations(new Location(2,2)));

        System.out.println("List of occupied locations around (2,2): " + g.getNeighbors(new Location(2,2)));

    }
}

