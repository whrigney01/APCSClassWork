package apcs.cockroach;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

public class Runner {
    //Extensions: I made the hide method use recursion to turn the bug if it is blocked. This extends my knowledge because i had to use parameters in a method as well as learning how to use recursion
    //I also made it so that the bug will completely stop even if it wants to alternate between 2 locations
    //This demonstrates mastery because I had to use methods from classes higher in the hierarchy and use the super. method to call them.
    //I also made it so that the user can specify which corner they want the cockroaches to go to using 2 arrow key inputs.
    //This demonstrates mastery because I had to use string class methods and for loops to make sure that all the inputs were legal.
    ///I also made it so there is a array of inputs that will be cleared if they are entered such as UPUP because they don't correspond to a corner and will break the code.
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
