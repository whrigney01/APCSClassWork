package apcs.customGW;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class CustomWorld extends ActorWorld {
    public boolean keyPressed(String description, Location loc){
        System.out.println(description);
        if(description.equals("SPACE")){
            System.out.println("YOU PRESSED SPACE AAAAAAAAAAAAAAAAAAA");
        }

            return false;
    }
}
