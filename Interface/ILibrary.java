package Interface;

import Model.Movie;

public interface ILibrary{

    public void  addMovie();
    public void addSong();
    public void addGame();
    public void findall();
    public void findByID();
    public void findByClass();
    public void findByName();
    public void AddFav();
    public void deleteByID(ID);
    public void update(fav);
    public void deleteByname();


}
