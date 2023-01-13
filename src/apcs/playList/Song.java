package apcs.playList;

import javax.print.attribute.standard.Media;
import java.io.File;
import javafx.scene.media.MediaPlayer;

public class Song {
    private String songName;
    private int plays;
    private int rating;
    private String bip

    public Song(String songName){
        this.songName = songName;
        this.plays = 0;
        this.rating = -1;
        Media hit = new Media(new File(bip).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }

    public String getSongName() {
        return songName;
    }

    public int getPlays() {
        return plays;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setPlays(int plays) {
        this.plays = plays;
    }

    public String toString() {
        if(rating == -1) {
            return "Title: " + songName + "; Plays: " + plays + "; Not Rated";
        }else{
            return "Title: " + songName + "; Plays: " + plays + "; Rating: " + rating;
        }
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

