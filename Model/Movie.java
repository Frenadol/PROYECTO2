package Model;

public class Movie  extends Favorite{
    protected String ReleaseDate;

    public Movie(String name, String category, String author, String idFavorite) {
        super(name, category, author, idFavorite);
    }

    public Movie(String name, String category, String author, String idFavorite, String releaseDate) {
        super(name, category, author, idFavorite);
        ReleaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }
}
