package Controller;

import Model.Library;

import java.util.Scanner;

public class MainController {
    public void run() {
        View.Menu.showMenu();
        int opcion = 0;
        int OptionClass = 0;

        Scanner Scanner = new Scanner(System.in);
        opcion = Scanner.nextInt();

        switch (opcion) {
            case 1:
                Library.AddFav();
                break;
            case 2:
                System.out.println("¿Qué te gustaría añadir?");
                System.out.println("1. Película");
                System.out.println("2. Canción");
                System.out.println("3. Juego");
                OptionClass = Scanner.nextInt();

                switch (OptionClass) {
                    case 1:
                        Library.addMovie();
                        break;
                    case 2:
                        Library.addSong();
                        break;
                    case 3:
                        Library.addGame();
                        break;
                    case 3:
                        Library.showFav();
                        break;
                    case 4:
                        System.out.println("¿Por que te gustaria buscar?");
                        System.out.println("1. All");
                        System.out.println("2. ID");
                        System.out.println("3. CLASE");
                        System.out.println("4. NOMBRE");

                        switch (OptionClass) {
                            case 1:
                                Library.findAll();
                                break;
                            case 2:
                                Library.findByID();
                                break;
                            case 3:
                                Library.findByClass();
                                break;
                            case 4:
                                Library.findByName();
                                break;
                            default:
                                System.out.println("Opción no valida, elige una opción del 1 al 4");
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("¿Por que te gustaria buscar para borrar?");
                        System.out.println("1. All");
                        System.out.println("2. ID");
                        System.out.println("3. CLASE");
                        System.out.println("4. NOMBRE");

                        switch (OptionClass) {
                            case 1:
                                Library.deleteAll();
                                break;
                            case 2:
                                Library.deleteByID();
                                break;
                            case 3:
                                Library.deleteByClass();
                                break;
                            case 4:
                                Library.deleteByName();
                                break;
                            default:
                                System.out.println("Opción no valida, elige una opción del 1 al 4");
                                break;
                        }
                        break;
                    case 6:

                        break;
                    case 7:
                        System.out.println("Saliendo de la biblioteca Trenosaurius");
                        break;
                    default:
                        System.out.println("Opción no valida, elige una opción del 1 al 7");
                        break;
                }
        }
    }
}
