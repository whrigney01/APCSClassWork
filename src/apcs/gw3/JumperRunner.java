package apcs.gw3;

import info.gridworld.actor.*;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class JumperRunner {
    public static void main(String[] args) {
        BoundedGrid<Actor> gr= new BoundedGrid<>(20,40);
        ActorWorld world = new ActorWorld(gr);
        Jumper jumpy = new Jumper();
        Location loc = new Location(0,0);
        Flower flower = new Flower();
        Bug bug = new Bug();
        Rock rock = new Rock();
        world.add(new Location(0,0), jumpy);
        world.add(new Location(0, 6), flower);
        world.add(new Location(0,8), rock);
        world.add(new Location(6, 11), bug);
        ArrayList<Location> rockLocs = new ArrayList<>();
        for(int i = 0; i<100; i++){
            loc = new Location((int)(Math.random()*20),(int)(Math.random()*40));
            if(loc.equals(new Location(1,1))){
                loc = new Location((int)(Math.random()*20)+1,(int)(Math.random()*40)+1);
            }
            world.add(loc,new Rock());
        }

        world.show();
    }
}
