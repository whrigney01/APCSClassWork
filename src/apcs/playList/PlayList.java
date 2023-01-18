package apcs.playList;

import java.util.ArrayList;


public class PlayList {
    //For my extensions I made a method that calculates the average rating of each song in the playlist that then is output as a playlist rating.
    // I also made a method that can get the artist of any song and set the artist as well as a method to reverse the playlist's order.
    // I also made methods that allow the user to specify a threshold of either rating or plays that they want a new playlist to be constructed with songs that only have a higher rating or play count that the threshhold.
    //Finally, I made a self-destruct method that set the songList variable to a new arraylist in case the user really does not like their play list and wants it gone forever.
    private ArrayList<Song> songList;

    public PlayList(){
        songList = new ArrayList<>();
    }

    public void add(String songName){
        songList.add(new Song(songName));
    }

    public void addWithArtist(String songName, String artist){
        songList.add(new Song(songName, artist));
    }

    public int size(){
        return songList.size();
    }

    public String getSong(int index){
        if(index >= songList.size() || index < 0){
            throw new IndexOutOfBoundsException("You don't know the number of songs in your own playlist minus 1. shaking shaking smh my head my head. Enter an index that exists please");
        }else{
            return songList.get(index).getSongName();
        }
    }

    public void play(int index){
        if(index >= songList.size() || index < 0){
            throw new IndexOutOfBoundsException("You don't know the number of songs in your own playlist minus 1. shaking shaking smh my head my head. Enter an index that exists please");
        }else{
            songList.get(index).setPlays(songList.get(index).getPlays() + 1);
            System.out.println(songList.get(index).toString());

        }
    }

    public void play(){
        for(int i = 0; i < songList.size(); i++){
            songList.get(i).setPlays(songList.get(i).getPlays() + 1);
            System.out.println(songList.get(i).toString());
        }
    }

    public void remove(int index){
        if(index >= songList.size() || index < 0){
            throw new IndexOutOfBoundsException("You don't know the number of songs in your own playlist minus 1. shaking shaking smh my head my head. Enter an index that exists please");
        }else{
            songList.remove(index);
        }

    }

    public void insert(int index, String songName){
        if(index < 0 || index > songList.size()){
            throw new IndexOutOfBoundsException("You don't know the number of songs in your own playlist minus 1. shaking shaking smh my head my head. Enter an index that exists please");
        }else{
            songList.add(index, new Song(songName));
        }
    }

    public void move(int fromIndex, int toIndex){

        if(fromIndex < 0 || fromIndex >= songList.size() || toIndex < 0 || toIndex >= songList.size()){
            throw new IndexOutOfBoundsException("You don't know the number of songs in your own playlist minus 1. shaking shaking smh my head my head. Enter an index that exists please");
        }else if (fromIndex > toIndex){
            Song oldSong = songList.get(fromIndex);
            songList.remove(fromIndex);
            songList.add(toIndex, oldSong);
        }else if(fromIndex < toIndex){
            Song oldSong = songList.get(fromIndex);
            songList.remove(fromIndex);
            songList.add(toIndex, oldSong);
        } else if (toIndex == songList.size() -1) {
            Song oldSong = songList.get(fromIndex);
            songList.add(toIndex, oldSong);
            songList.remove(fromIndex);
        }
    }

    public int find(String songName){
        for(int i = 0; i < songList.size(); i++){
            if(songList.get(i).getSongName().equals(songName)){
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Song> getMostPlayed(){
        ArrayList<Song> mostPlayedSongs= new ArrayList<>();
        if(songList.size() == 0){
            throw new IllegalStateException("Add songs to your playlist. Like come on. you cant have a most played song without any songs on the playlist :skull emoji:");
        }else{
            int max = 0;
            for(int i =0; i <songList.size(); i++){
                if(songList.get(i).getPlays() > max){
                    max = songList.get(i).getPlays();
                }
            }
            for(int i = 0; i < songList.size(); i++){
                if(songList.get(i).getPlays() == max){
                    mostPlayedSongs.add(songList.get(i));
                }
            }
            return mostPlayedSongs;
        }
    }

    public void rate(int index, int ratingValue){
        if(index > this.size()|| index < 0){
            throw new IndexOutOfBoundsException("You don't know the number of songs in your own playlist minus 1. shaking shaking smh my head my head. Enter an index that exists please");
        }else if (ratingValue < 0 || ratingValue > 5){
            throw new RuntimeException("I know you want to rate songs with a rating below zero but and i do too but unfortunately that is not supported");
        }else{
            songList.get(index).setRating(ratingValue);
        }
    }

    public ArrayList<Song> getFavorite(){
        ArrayList<Song> mostPlayedSongs= new ArrayList<>();
        if(songList.size() == 0){
            throw new IllegalStateException("Add songs to your playlist. Like come on. you cant have a most played song without any songs on the playlist :skull emoji:");
        }else{
            int max = 0;
            for(int i =0; i <songList.size(); i++){
                if(songList.get(i).getRating() > max){
                    max = songList.get(i).getRating();
                }
            }
            for(int i = 0; i < songList.size(); i++){
                if(songList.get(i).getRating() == max){
                    mostPlayedSongs.add(songList.get(i));
                }
            }
            return mostPlayedSongs;
        }
    }

    public double ratePlaylist(){
        double sum = 0;
        for(int i =0;i< songList.size(); i++){
            sum += songList.get(i).getRating();
        }
        return sum/(double) songList.size();
    }
    public void selfDestruct(){
        songList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return songList.toString();
    }

    public String getArtist(int index){
        if(index < 0 || index >= songList.size()){
            throw new IndexOutOfBoundsException("There is no song at index " + index);
        }else {
            return this.songList.get(index).getArtist();
        }
    }

    public void setArtist(int index, String newArtist){
        if(index < 0 || index >= songList.size()){
            throw new IndexOutOfBoundsException("There is no song at index " + index);
        }else {
            this.songList.get(index).setArtist(newArtist);
        }
    }

    public void reverseList(){
        ArrayList<Song> newSongList = new ArrayList<>();
        for(int i = songList.size() -1;  i >= 0; i--){
            newSongList.add(songList.get(i));
        }
        songList = newSongList;
    }

    public ArrayList<Song> extractListByRatings(int threshold){
        if(threshold >= 0 && threshold <= 5) {
            ArrayList<Song> thresholdList = new ArrayList<>();
            for (int i = 0; i < songList.size(); i++) {
                if (songList.get(i).getRating() >= threshold) {
                    thresholdList.add(songList.get(i));
                }
            }
            return thresholdList;
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    public ArrayList<Song> extractListByPlays(int threshold){
        if(threshold >= 0) {
            ArrayList<Song> thresholdList = new ArrayList<>();
            for (int i = 0; i < songList.size(); i++) {
                if (songList.get(i).getPlays() >= threshold) {
                    thresholdList.add(songList.get(i));
                }
            }
            return thresholdList;
        }else{
            throw new IndexOutOfBoundsException();
        }
    }
}
