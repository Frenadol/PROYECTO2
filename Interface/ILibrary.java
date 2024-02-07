package Interface;

import Model.Library;

public interface ILibrary {

    public void  addMovie();
    public void addSong();
    public void addGame();
    public void findall();
    public void findByID();
    public void findByClass();
    public void findByName();
    public void AddFav();
    public void deleteByID(idFavorite);
    public void update(fav);
    public void deleteByname();
    public void showFav();
    public void deleteAll();
    public void deleteByClass();
    public void deleteByName();

}
