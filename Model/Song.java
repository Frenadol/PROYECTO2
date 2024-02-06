package Model;

public class Song extends Favorite{
    protected String duration;

    public Song(String name, String category, String author, String duration) {
        super(name, category, author);
        this.duration = duration;
    }

    public Song(String name, String category, String author) {
        super(name, category, author);
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}