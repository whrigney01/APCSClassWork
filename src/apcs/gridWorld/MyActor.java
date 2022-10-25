package apcs.gridWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;

import java.awt.*;

public class MyActor extends Bug {
    public String toString () {
        return super.toString() + " Myacty is the best name to ever have been created";
    }
    public MyActor () {
        super.setColor(new Color (29, 188, 210));
    }

}
