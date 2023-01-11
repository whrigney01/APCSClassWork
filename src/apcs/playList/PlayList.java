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

    public void selfDestruct(){
        songList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return songList.toString();
    }
}
