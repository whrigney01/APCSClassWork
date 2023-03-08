package apcs.cockroach;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class CockroachWorld extends ActorWorld {
    private static boolean lightsOff = true;

    private String keyString = "";

    private String [] saatwikBannedWords;

    public CockroachWorld(Grid<Actor> grid) {
        super(grid);
        this.setMessage("Welcome to CockroachWorld");
        saatwikBannedWords = new String[]{"RIGHTRIGHT", "DOWNDOWN", "UPUP", "LEFTLEFT", "UPDOWN", "DOWNUP", "LEFTRIGHT", "RIGHTLEFT" };
    }



    public static boolean getLightsOff() {
        return CockroachWorld.lightsOff;
    }

    public static void setLightsOff(boolean lightsOff) {
        CockroachWorld.lightsOff = lightsOff;
    }


    public boolean keyPressed(String key, Location loc) {
        ArrayList<Location> occLocs = this.getGrid().getOccupiedLocations();
        Grid gr = this.getGrid();
        if(key.equals("UP") || key.equals("LEFT") || key.equals("RIGHT") || key.equals("DOWN")){
            keyString += key;
            System.out.println(key + " " + keyString);
        }

        if(key.equals("SPACE")){
            CockroachWorld.setLightsOff(!CockroachWorld.getLightsOff());

        }

        if (keyString.equals("LEFTUP") || keyString.equals("UPLEFT")){
            Cockroach.cornerTo = new Location(0,0);
            keyString = "";

        }else if(keyString.equals("RIGHTUP") || keyString.equals("UPRIGHT")){
            Cockroach.cornerTo = new Location(0,39);
            keyString = "";
        }else if(keyString.equals("LEFTDOWN") || keyString.equals("DOWNLEFT")){
            Cockroach.cornerTo = new Location(19,0);
            keyString = "";
        }else if(keyString.equals("RIGHTDOWN") || keyString.equals("DOWNRIGHT")){
            Cockroach.cornerTo = new Location(19,39);
            keyString = "";
        }

        for(int i= 0; i < saatwikBannedWords.length; i++) {
            if(saatwikBannedWords[i].equals(keyString)){
                keyString = "";
            }
        }

        if (!CockroachWorld.getLightsOff()) {
            this.setMessage("The lights are on\nBugs are going to corner " + Cockroach.cornerTo);
        } else {
            this.setMessage("The lights are off");
        }

        for (int i = 0; i < occLocs.size(); i++) {
            if(gr.get(occLocs.get(i)) instanceof Cockroach){
                ((Cockroach) gr.get(occLocs.get(i))).setOldLoc(null);
            }
        }
        return true;
    }

}
