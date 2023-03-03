package apcs.cockroach;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class CockroachWorld extends ActorWorld {
    private static boolean lightsOff = true;

    public CockroachWorld(Grid<Actor> grid) {
        super(grid);
        this.setMessage("Welcome to CockroachWorld");

    }

    public static boolean getLightsOff() {
        return CockroachWorld.lightsOff;
    }

    public static void setLightsOff(boolean lightsOff) {
        CockroachWorld.lightsOff = lightsOff;
    }

    public boolean keyPressed(String key, Location loc) {
        if (key.equals("SPACE")){
            CockroachWorld.setLightsOff(!CockroachWorld.getLightsOff());
        }

        if (CockroachWorld.getLightsOff()) {
            this.setMessage("The lights are on");
        } else {
            this.setMessage("The lights are off");
        }
        return true;
    }

}
