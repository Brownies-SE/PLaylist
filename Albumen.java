import java.util.ArrayList;
import java.util.LinkedList;

public class Albumen {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Albumen(String name, String artist, ArrayList<Song> songs) {
        this.name = name;
        this.artist = name;
        this.songs = new ArrayList<Song>();
    }

    public Albumen() {

    }

    public Song getSong(String title) {
        for (Song getTheSong: songs) {
            if (getTheSong.getTitle().equals(title)) {
                return getTheSong;
            }  
        }
        return null;
    }

    public boolean addSong(String title, double length) {
        if (getSong(title) == null) {
            songs.add(new Song(title, length));
            System.out.println(title + "was added");
            return true;
        }
        else {
            System.out.println("That song already exists ");
            return false;
        }
    }
}