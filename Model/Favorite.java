package Model;

public class Favorite {
    protected String name;
    protected String category;
    protected String author;
    protected String idFavorite;

    public Favorite(String name, String category, String author, String idFavorite) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.idFavorite = idFavorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIdFavorite() {
        return idFavorite;
    }

    public void setIdFavorite(String idFavorite) {
        this.idFavorite = idFavorite;
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", author='" + author + '\'' +
                ", idFavorite='" + idFavorite + '\'' +
                '}';
    }
}
