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
        int live = 2;
        int live2 = 3;
        int birth = 3;
        Scanner reader = new Scanner(System.in);
        UnboundedGrid<Actor> gr = new UnboundedGrid<Actor>();
        ActorWorld world = new ActorWorld(gr);
        System.out.print("Do you want enter custom Live/Birth/Death rules? (y/n): ");
        String ans = reader.nextLine();
        if(ans.equals("y")){
            System.out.print("How many cells should be around the space where a new cell is born?: ");
            birth = reader.nextInt();
            System.out.print("How many cells should be around a cell that lives? (Value 1/2): ");
            live = reader.nextInt();
            System.out.print("How many cells should be around a cell that lives? (Value 2/2): ");
            live2= reader.nextInt();
        }
        File file = new File("InitialCellPlacement");
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                if (scanner.hasNextInt()) {
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    world.add(new Location(num1, num2), new Cell(birth, live, live2));
                }else{
                    String temp = scanner.nextLine();
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
