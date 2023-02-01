package apcs.life;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LifeRunner {

    public static void main(String[] args) {
        UnboundedGrid<Actor> gr = new UnboundedGrid<Actor>();
        ActorWorld world = new ActorWorld(gr);
        File file = new File("C:\\Users\\willi\\IdeaProjects\\apcs-whrigney01\\src\\apcs\\life\\InitialCellPlacement");
        try{
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()) {
                if (reader.hasNextInt()) {
                    int num1 = reader.nextInt();
                    int num2 = reader.nextInt();
                    world.add(new Location(num1, num2), new Cell());
                }else{
                    String temp = reader.nextLine();
                }
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        world.add(new Location (2, 0),new Cell());
//        world.add(new Location (2, 1),new Cell());
//        world.add(new Location (2, 2),new Cell());
//        world.add(new Location (1, 2),new Cell());
//        world.add(new Location (0, 1),new Cell());
//
        world.show();
    }



}
