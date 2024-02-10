package Model;

import java.io.*;
import java.util.ArrayList;

public class ManejoSerializador {

    public static void main(String[] args) {
        ArrayList<favorite> miArrayList = new ArrayList<>();
        // Agrega elementos a tu ArrayList

        // Serializar
        serializarArrayList(miArrayList, "archivo_serializado.ser");

        // Deserializar
        ArrayList<favorite> miArrayListDeserializado = deserializarArrayList("archivo_serializado.ser");

        // Ahora puedes usar el ArrayList deserializado
        // ...
    }

    private static void serializarArrayList(ArrayList<favorite> lista, String nombreArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(lista);
            System.out.println("ArrayList serializado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<favorite> deserializarArrayList(String nombreArchivo) {
        ArrayList<favorite> listaDeserializada = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            listaDeserializada = (ArrayList<favorite>) ois.readObject();
            System.out.println("ArrayList deserializado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaDeserializada;
    }
}

// Clase que implementa Serializable
class favorite implements Serializable {
    // Atributos y métodos de la clase
}
}
