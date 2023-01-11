package apcs.playList;

public class Song {
    private String songName;
    private int plays;

    public Song(String songName){
        this.songName = songName;
        this.plays = 0;
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
        return "Title: " + songName + "; Plays: " + plays;
    }
}

