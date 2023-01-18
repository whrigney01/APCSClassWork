package apcs.playList;


import java.util.Scanner;

public class ExtensionTestRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        PlayList extensionList = new PlayList();
        extensionList.addWithArtist("The Final Countdown", "Europe");
        extensionList.addWithArtist("Livin' on a Prayer", "Bon Jovi");
        extensionList.addWithArtist("Home Depot Beat", "The Home Depot");
        extensionList.addWithArtist("Holiday Home Depot Beat", "The Home Depot");
        extensionList.addWithArtist("Meglovania", "Toby Fox");
        extensionList.addWithArtist("O Canada", "Calixa Lavallee");
        extensionList.rate(0, 1);
        extensionList.rate(1 , 2);
        extensionList.rate(2, 3);
        extensionList.rate(3, 4);
        extensionList.rate(4, 5);
        extensionList.rate(5, 5);

        System.out.println();
        System.out.println("Average Playlist Rating: " + extensionList.ratePlaylist());
        System.out.println();
        System.out.println("PlayList: " + extensionList.toString());

        System.out.println("\nArtist Testing\n");

        System.out.println("The artist of " + extensionList.getSong(1) + " is " + extensionList.getArtist(1));
        System.out.println("The artist of " + extensionList.getSong(5) + " is " + extensionList.getArtist(5));
        System.out.println("The artist of " + extensionList.getSong(3) + " is " + extensionList.getArtist(3));
        extensionList.setArtist(3, "Mariah Carry");
        System.out.println("The artist of " + extensionList.getSong(3) + " is " + extensionList.getArtist(3));
        try{
            extensionList.getArtist(6);
        }catch (IndexOutOfBoundsException e){
            System.out.println("There is no song at the index value of 6");
        }

        System.out.println("\nReverse List Testing\n");

        System.out.println(extensionList.toString());
        extensionList.reverseList();
        System.out.println(extensionList.toString());

        System.out.println("\nExtracting above a Threshold Testing\n");

        System.out.println("Above a Rating Threshold\n");
        System.out.println("Songs with a rating above 3: " + extensionList.extractListByRatings(3));
        System.out.println("Song with a rating above 4:  "+ extensionList.extractListByRatings(4));
        try{
            System.out.println(extensionList.extractListByRatings(6));
        }catch (IndexOutOfBoundsException e){
            System.out.println("You can't have ratings above 5");
        }
        try {
            System.out.println(extensionList.extractListByRatings(-3));
        }catch (IndexOutOfBoundsException e){
            System.out.println("You can't have ratings below -1");
        }

        System.out.println("\nAbove a Play Threshold\n");

        extensionList.play();
        extensionList.play();
        extensionList.play(2);
        extensionList.play(5);
        extensionList.play(4);
        extensionList.play(3);
        extensionList.play(5);
        extensionList.play(5);
        extensionList.play(4);

        System.out.println();

        System.out.println("Songs with more that 3 plays: " + extensionList.extractListByPlays(3));
        System.out.println("Songs with more that 4 plays: " + extensionList.extractListByPlays(4));
        System.out.println("Songs with more that 5 plays: " + extensionList.extractListByPlays(5));
        try{
            System.out.println(extensionList.extractListByPlays(-1));
        }catch (IndexOutOfBoundsException e){
            System.out.println("You can't have less than 0 plays");
        }

        System.out.print("\nDo you want your playlist to self destruct (Yes = y No = n): ");
        String answer = reader.nextLine();
        System.out.println();
        if(answer.equals("y")){
            extensionList.selfDestruct();
            System.out.println(extensionList.toString());
        }else{
            System.out.println(extensionList.toString());
        }

    }
}
