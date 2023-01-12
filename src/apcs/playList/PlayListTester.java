package apcs.playList;

import java.util.Scanner;

public class PlayListTester {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        PlayList aList = new PlayList();
        System.out.println ("Initial (empty) List is:\n" + aList);
        System.out.println("Initial (empty) List is " + aList.size() + " song big" );

        System.out.println ("\nTesting add and toString");
        System.out.println ("Adding The Final Countdown");
        aList.add ("The Final Countdown");
        System.out.println ("Adding Livin' on a Prayer");
        aList.add ("Livin' on a Prayer");
        System.out.println();

        System.out.print("Enter an index to get Song: ");
        int num = reader.nextInt();
        System.out.println(aList.getSong(num));
        System.out.println();

        System.out.print("Enter an index of a song you want to play: ");
        int num1 = reader.nextInt();
        aList.play(num1);
        System.out.println();

        aList.play();
        System.out.println();

        System.out.println ("List is:\n" + aList);
        System.out.println("List is " + aList.size() + " songs big" );
        System.out.println();

        System.out.println("What song index do you want to insert at: ");
        int num3 = reader.nextInt();
        System.out.println("What song do you want to add: ");
        String songName = reader.nextLine();
        aList.insert(1, songName);
        System.out.println();

        System.out.println ("List is:\n" + aList);
        System.out.println("List is " + aList.size() + " songs big" );
        System.out.println();

        System.out.print("What song index do you want to remove: ");
        int num2 = reader.nextInt();
        aList.remove(num2);
        System.out.println();

        System.out.println ("List is:\n" + aList);
        System.out.println("List is " + aList.size() + " songs big" );
        System.out.println();



    }
}
