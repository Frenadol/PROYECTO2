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
    public void findByID(String idFavorite) {
        for (int i = 0; i < favorites.size(); i++) {
             idFavorite=
        }
    }
    public void findByClass(){

    }
    public void findByName(String name){

    }
    public void AddFav(){

    }
    public void deleteByID(Favorite idFavorite){

    }
    public void update(Favorite){

    }
    public void deleteByname(){

    }
}