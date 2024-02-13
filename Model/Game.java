package Model;

public class Game extends Favorite{
    protected String Platarform;

    public Game(String name, String category, String author, String idFavorite) {
        super(name, category, author, idFavorite);
    }

    public Game(String name, String category, String author, String idFavorite, String platarform) {
        super(name, category, author, idFavorite);
        Platarform = platarform;
    }
    public Game() {
        super("", "", "", "");
    }

    public String getPlatarform() {
        return Platarform;
    }

    public void setPlatarform(String platarform) {
        Platarform = platarform;
    }
}