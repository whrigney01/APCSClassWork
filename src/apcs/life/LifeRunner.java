
//Extension: Created a way to enter cords in a txt file that then will be placed on the grid. This code also ignores any not int characters that will cause an error.
//This extends my knowledge because I had to place the actor at a specific location on the grid based on the user input.
//I created a simple if statement that has a 0.5% chance to not kill the cell when the cell is supposed to die (commented out currently for testing with glider gun).
//This exteneds my knowledge by me having to know what lines of code kill the cell and how to use the Math java class to make it have a chance to live
//I also created a way to specify birth/life/death rules through a scanner that defaults to the default rules.
//This extends my knowledge of gridWorld by knowing where to put the specific birth life and death rules to make it so they actually affect the outcome of the cell.
//It also extends my knowledge of the scanner class and class building by making instance variables and setting them in a constructor to affect the cell.
package apcs.life;


import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LifeRunner {
    public static ActorWorld world;

    public static void updateMessage(){
        world.setMessage("Total Cells: " + Cell.getCellCount());
    }
    public static void main(String[] args) {
        int live = 2;
        int live2 = 3;
        int birth = 3;
        Scanner reader = new Scanner(System.in);
        UnboundedGrid<Actor> gr = new UnboundedGrid<Actor>();
         LifeRunner.world = new ActorWorld(gr);
         LifeRunner.world.setMessage("Welcome to Life!");
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
