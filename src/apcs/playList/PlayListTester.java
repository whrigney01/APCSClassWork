package apcs.playList;

import java.util.Scanner;

public class PlayListTester {
    public static void main(String[] args) {
        System.setErr (System.out);
        PlayList aList = new PlayList();
        System.out.println ("Initial (empty) List is:\n" + aList);
        System.out.println("Initial (empty) List is " + aList.size() + " song big" );

        System.out.println ("\nTesting add and toString");
        System.out.println ("Adding The Final Countdown");
        aList.add ("The Final Countdown");
        System.out.println ("Adding Livin' on a Prayer");
        aList.add ("Livin' on a Prayer");
        System.out.println("Adding Home Depot Beat");
        aList.add("Home Depot Beat");
        System.out.println("Adding the Holiday Home Depot Beat");
        aList.add("Holiday home depot beat");
        System.out.println("\n" + aList.toString());

        System.out.println("\nInserting Songs Testing\n");

        System.out.println("Added " + aList.getSong(0));
        System.out.println("Added " + aList.getSong(1));
        System.out.println("Added " + aList.getSong(2));
        System.out.println("Added " + aList.getSong(3));
        try{
            System.out.println(aList.getSong(-1));
        }catch (Exception e){
            System.out.println("Error: ");
            e.printStackTrace();
        }
        try{
            System.out.println(aList.getSong(4));
        }catch (Exception e){
            System.out.println("Error: ");
            e.printStackTrace();
        }

        System.out.println("\nPlay Testing\n");

        aList.play(0);
        aList.play(1);
        aList.play(2);
        aList.play(3);
        try{
            aList.play(4);
        }catch (Exception e){
            System.out.println("Error: ");
            e.printStackTrace();
        }
        try{
            aList.play(-1);
        }catch (Exception e){
            System.out.println("Error: ");
            e.printStackTrace();
        }
        aList.play();

        System.out.println("\n" + aList.toString() + "\n");

        System.out.println("\nInserting Testing\n");
        aList.insert(0, "Take on Me");
        aList.insert(4, "How to save a Life");
        try{
            aList.insert(6,"Insert Cool Song Name Here");
        }catch (Exception e){
            System.out.println("Error: ");
            e.printStackTrace();
        }
        try{
            aList.insert(6, "Insert Even Cooler Song Name Here");
        }catch (Exception e){
            System.out.println("Error: ");
            e.printStackTrace();
        }

        System.out.println("\n" + aList.toString() + "\n");

        System.out.println("\nRemove Testing\n");

        aList.remove(0);
        aList.remove(3);
        try{
            aList.remove(6);
        }catch (Exception e){
            System.out.println("Error: ");
            e.printStackTrace();
        }
        try{
            aList.remove(-1);
        }catch (Exception e){
            System.out.println("Error: ");
            e.printStackTrace();
        }

        System.out.println("\n" + aList.toString() + "\n");

        System.out.println("\nMove testing\n");

        System.out.println("\n" + aList + "\n");
        aList.move(0,2);
        System.out.println("\n" + aList + "\n");
        aList.move(2,0);
        System.out.println("\n" + aList + "\n");
        aList.move(0,3);
        System.out.println("\n" + aList + "\n");
        try{
            aList.move(0, 6);
        }catch (Exception e){
            System.out.println("Error: ");
            e.printStackTrace();
        }
        try{
            aList.move(-1, 3);
        }catch (Exception e){
            System.out.println("Error: ");
            e.printStackTrace();
        }
        try{
            aList.move(-5, 2000);
        }catch (Exception e){
            System.out.println("Error: ");
            e.printStackTrace();
        }

        System.out.println();

        System.out.println(aList.toString());

        System.out.println();

        System.out.println("Find testing");
        System.out.println();

        System.out.println("Finding index of home depot beat" );
        System.out.println(aList.find("Home Depot Beat"));
        System.out.println("Finding index of song not in playlist");
        System.out.println(aList.find("A Song that Doesn't Exist"));
        System.out.println();

        System.out.println();
        System.out.println("Get most played song");
        System.out.println();

        System.out.println(aList.getMostPlayed());

        System.out.println();
        System.out.println("Rating Testing");
        System.out.println();

        aList.rate(1, 5);
        aList.rate(2, 3);
        aList.rate(0, 5);
        aList.rate(3, 1);
        try{
            aList.rate(7, 3);
        }catch (Exception e){
            System.out.println("Error: ");
            e.printStackTrace();
        }
        try{
            aList.rate(1, 6);
        }catch (Exception e){
            System.out.println("Error: ");
            e.printStackTrace();
        }

        System.out.println();

        System.out.println("Favorite Songs:\n");
        System.out.println(aList.getFavorite());
    }
}
