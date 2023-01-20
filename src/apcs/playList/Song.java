package apcs.playList;



public class Song {
    private String songName;
    private int plays;
    private int rating;
    private String artist;

    public Song(String songName){
        this.songName = songName;
        this.plays = 0;
        this.rating = -1;
        this.artist = "";
    }

    public Song(String songName, String artist){
        this.songName = songName;
        this.plays = 0;
        this.rating = -1;
        this.artist = artist;
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
        if (artist.equals("")) {
            if (rating == -1) {
                return "\nTitle: " + songName + "; Plays: " + plays + "; Not Rated";
            } else {
                return "\nTitle: " +  songName + "; Plays: " + plays + "; Rating: " + rating;
            }
        }else{
            if (rating == -1) {
                return "\nTitle: " + songName + "'; Artist: " + artist + "; Plays: " + plays + "; Rating: Not Rated";
            } else {
                return "\nTitle: " +  songName + "; Artist: " + artist + "; Plays: " + plays + "; Rating: " + rating;
            }
        }
    }

    public int getRating() {
        return rating;
    }


    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}

