package Model;

public class Song extends Favorite{
    protected String duration;

    public Song(String name, String category, String author, String idFavorite) {
        super(name, category, author, idFavorite);
    }

    public Song(String name, String category, String author, String idFavorite, String duration) {
        super(name, category, author, idFavorite);
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}