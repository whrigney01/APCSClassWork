package apcs.playList;

import java.sql.Array;
import java.util.ArrayList;

public class ExtensionTEstRunner {
    public static void main(String[] args) {


        PlayList extensionList = new PlayList();
        extensionList.add("The Final Countdown");
        extensionList.add("Livin' on a Prayer");
        extensionList.add("Home Depot Beat");
        extensionList.add("holiday home depot beat");
        extensionList.add("Meglovania");
        extensionList.rate(0, 1);
        extensionList.rate(1 , 2);
        extensionList.rate(2, 3);
        extensionList.rate(3, 4);
        extensionList.rate(4, 5);
        System.out.println("Playlist rating: " + extensionList.ratePlaylist());
    }
}
