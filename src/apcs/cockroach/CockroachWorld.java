package apcs.cockroach;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class CockroachWorld extends ActorWorld {
    private static boolean lightsOff = true;

    private String keyString = "";

    private static int toCorner;

    public CockroachWorld(Grid<Actor> grid) {
        super(grid);
        this.setMessage("Welcome to CockroachWorld");

    }

    public static int getToCorner() {
        return toCorner;
    }

    public static boolean getLightsOff() {
        return CockroachWorld.lightsOff;
    }

    public static void setLightsOff(boolean lightsOff) {
        CockroachWorld.lightsOff = lightsOff;
    }


    public boolean keyPressed(String key, Location loc) {
        if(!key.equals("SPACE")) {
            keyString.concat(key);
            System.out.println(keyString);
        }

        if(key.equals("SPACE")){
            CockroachWorld.setLightsOff(!CockroachWorld.getLightsOff());
        }

        if (keyString.equals("LEFTUP") || keyString.equals("UPLEFT")){
            CockroachWorld.toCorner = 1;
            keyString = "";
        }

        if(keyString.equals("RIGHTUP") || keyString.equals("UPRIGHT")){
            CockroachWorld.toCorner = 2;
            keyString = "";
        }

        if(keyString.equals("LEFTDOWN") || keyString.equals("DOWNLEFT")){
            CockroachWorld.toCorner = 3;
            keyString = "";
        }

        if(keyString.equals("RIGHTDOWN") || keyString.equals("DOWNRIGHT")){
            CockroachWorld.toCorner = 4;
            keyString = "";
        }

        if (!CockroachWorld.getLightsOff()) {
            this.setMessage("The lights are on");
        } else {
            this.setMessage("The lights are off");
        }
        return true;
    }

}
