package Model;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Favorite> favorites;

    public Library() {
        favorites = new ArrayList<>();
    }

    public void addMovie(Movie movie){
        favorites.add((Favorite) movie);
    }

    public void addSong(Song song){
        favorites.add((Favorite) song);
    }

    public void addGame(Game game){
        favorites.add((Favorite) game);
    }

    public List<Favorite> findAll() {
        return favorites;
    }

    public Favorite findByID(String idFavorite) {
        boolean found = false;
        Favorite favSearched = null;
        for (Favorite favorite : favorites) {
            if (favorite.getIdFavorite().equals(idFavorite) && !found) {
                favSearched = favorite;
                found = true;
            }
        }
        return favSearched;
    }

    public void findByClass(int optionClass) {
        for (Favorite favorite : favorites) {
            if (getFavoriteClass(favorite) == optionClass) {
                System.out.println(favorite);
            }
        }
    }

    public void findByName(String name) {
        for (Favorite favorite : favorites) {
            if (favorite.getName().equals(name)) {
                System.out.println(favorite);
            }
        }
    }

    public void deleteFavoriteById(String idFavorite) {
        boolean found = false;
        for (int i = 0; i < favorites.size() && !found; i++) {
            if (favorites.get(i).getIdFavorite().equals(idFavorite)) {
                favorites.remove(i);
                found = true;
            }
        }
    }

    public void deleteAllFavorites() {
        favorites.clear();
    }

    public void updateFavorite(Favorite favorite) {
        boolean found = false;
        for (int i = 0; i < favorites.size() && !found; i++) {
            if (favorites.get(i).getIdFavorite().equals(favorite.getIdFavorite())) {
                favorites.set(i, favorite);
                found = true;
            }
        }
    }
    public void deleteByClass(int optionClass) {
        for (Favorite favorite : favorites) {
            if (getFavoriteClass(favorite) == optionClass) {
                favorites.remove(favorite);
            }
        }
    }

    public void deleteByName(String name) {
        for (Favorite favorite : favorites) {
            if (favorite.getName().equals(name)) {
                favorites.remove(favorite);
            }
        }
    }

    public void showFavorites() {
        for (Favorite favorite : favorites) {
            System.out.println(favorite);
        }
    }

    private int getFavoriteClass(Favorite favorite) {
        if (favorite instanceof Movie) {
            return 1;
        } else if (favorite instanceof Song) {
            return 2;
        } else if (favorite instanceof Game) {
            return 3;
        }
        return 0;
    }
}