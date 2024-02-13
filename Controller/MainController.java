package Controller;

import Model.Library;
import Model.Movie;
import Model.Song;
import Model.Game;

import java.util.Scanner;

public class MainController {

    private Library library;

    public MainController() {
        this.library = new Library();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int option;
        int optionClass;

        do {
            View.Menu.showMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    library.showFavorites();
                    break;
                case 2:
                    System.out.println("¿Qué te gustaría añadir?");
                    System.out.println("1. Película");
                    System.out.println("2. Canción");
                    System.out.println("3. Juego");
                    optionClass = scanner.nextInt();

                    switch (optionClass) {
                        case 1:
                            library.addMovie(new Movie());
                            break;
                        case 2:
                            library.addSong(new Song());
                            break;
                        case 3:
                            library.addGame(new Game());
                            break;
                        default:
                            System.out.println("Opción no válida, elige una opción del 1 al 3");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("¿Qué te gustaría buscar?");
                    System.out.println("1. Todos");
                    System.out.println("2. Por ID");
                    System.out.println("3. Por Clase");
                    System.out.println("4. Por Nombre");

                    optionClass = scanner.nextInt();
                    switch (optionClass) {
                        case 1:
                            library.findAll();
                            break;
                        case 2:
                            System.out.println("Ingrese el ID:");
                            scanner.nextLine();
                            String idSearch = scanner.nextLine();
                            library.findByID(idSearch);
                            break;
                        case 3:
                            System.out.println("Ingrese la clase (1: Película, 2: Canción, 3: Juego):");
                            int classSearch = scanner.nextInt();
                            library.findByClass(classSearch);
                            break;
                        case 4:
                            System.out.println("Ingrese el nombre:");
                            scanner.nextLine();
                            String nameSearch = scanner.nextLine();
                            library.findByName(nameSearch);
                            break;
                        default:
                            System.out.println("Opción no válida, elige una opción del 1 al 4");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("¿Qué te gustaría buscar para borrar?");
                    System.out.println("1. Todos");
                    System.out.println("2. Por ID");
                    System.out.println("3. Por Clase");
                    System.out.println("4. Por Nombre");

                    optionClass = scanner.nextInt();
                    switch (optionClass) {
                        case 1:
                            library.deleteAllFavorites();
                            break;
                        case 2:
                            System.out.println("Ingrese el ID:");
                            scanner.nextLine();
                            String idDelete = scanner.nextLine();
                            library.deleteFavoriteById(idDelete);
                            break;
                        case 3:
                            System.out.println("Ingrese la clase (1: Película, 2: Canción, 3: Juego):");
                            int classDelete = scanner.nextInt();
                            library.deleteByClass(classDelete);
                            break;
                        case 4:
                            System.out.println("Ingrese el nombre:");
                            scanner.nextLine();
                            String nameDelete = scanner.nextLine();
                            library.deleteByName(nameDelete);
                            break;
                        default:
                            System.out.println("Opción no válida, elige una opción del 1 al 4");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Saliendo de la biblioteca Trenosaurius");
                    break;
                default:
                    System.out.println("Opción no válida, elige una opción del 1 al 5");
                    break;
            }
        } while (option != 5);
    }
}