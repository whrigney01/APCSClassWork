package apcs.playList;

import java.util.ArrayList;

public class PlayList {
    private ArrayList<Song> songList;

    public PlayList(){
        songList = new ArrayList<>();
    }

    public void add(String songName){
        songList.add(new Song(songName));
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
        }else{
            Song oldSong = songList.get(fromIndex);
            songList.remove(fromIndex);
            songList.add(toIndex, oldSong);
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
            throw new IllegalStateException("Add songs to your playlist. Like come on. you cant have a most played song without any songs on the playlist :skull emoji:")
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

    public void selfDestruct(){
        songList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return songList.toString();
    }
}
