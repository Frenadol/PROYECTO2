package Model;

public class Movie  extends Favorite{
    protected String ReleaseDate;

    public Movie(String name, String category, String author, String releaseDate) {
        super(name, category, author);
        ReleaseDate = releaseDate;
    }

    public Movie(String name, String category, String author) {
        super(name, category, author);
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }
}
