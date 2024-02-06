package Model;

public class Game extends Favorite{
    protected String Platarform;

    public Game(String name, String category, String author, String platarform) {
        super(name, category, author);
        Platarform = platarform;
    }

    public Game(String name, String category, String author) {
        super(name, category, author);
    }

    public String getPlatarform() {
        return Platarform;
    }

    public void setPlatarform(String platarform) {
        Platarform = platarform;
    }
}