public class Song {
    private String title;
    private double length;

    public Song(String title, double length) {
        this.title = title;
        this.length = length;
    }

    public Song() {
        
    }

    public String getTitle() {
        return title;
    }

    public double getLength() {
        return length;
    }

    public String toString() {
        return title + "" + length;
    }
}
