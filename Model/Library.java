package Model;
import java.util.Scanner;
import java.util.ArrayList;
public class Library {
    private ArrayList<Favorite> favorites;
    public void  addMovie(Movie movie){
        favorites.add((Favorite) movie);
    }
    public void addSong(Song song){
        favorites.add((Favorite) song);
    }
    public void addGame(Game game){
        favorites.add((Favorite) game);
    }
    public ArrayList<Favorite> findAll() {
        return favorites;
    }
    public Favorite findByID(String idFavorite) {
        boolean id=true;
        Favorite favSearched = null;
        for (int i = 0; i < favorites.size() && id; i++) {
            if (favorites.get(i).getIdFavorite().equals(idFavorite)) {
                favSearched = favorites.get(i);
                break;

            }
        }
        return favSearched;
    }
    public void findByClass(int optionClass) {
        for (Favorite favorite : favorites) {
            if (favorite.getClass()== optionClass) {
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
        for (int i = 0; i < favorites.size(); i++) {
            if (favorites.get(i).getIdFavorite().equals(idFavorite)) {
                favorites.remove(i);
                break;
            }
        }
    }

    public void deleteAllFavorites() {
        favorites.clear();
    }

    public void updateFavorite(Favorite favorite) {
        for (int i = 0; i < favorites.size(); i++) {
            if (favorites.get(i).getIdFavorite().equals(favorite.getIdFavorite())) {
                favorites.set(i, favorite);
                }

            }
        }


    public void showFavorites() {
        for (Favorite favorite : favorites) {
            System.out.println(favorite);
        }
    }
}