package main;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private static Libreria instance;
    private List<String> books;
    private int cantidadLibros;

    private Libreria() {
        books = new ArrayList<>();
    }
    
    //Aplicando patron singleton
    
    public static synchronized Libreria getInstance() {
        if (instance == null) {
            instance = new Libreria();
        }
        return instance;
    }
    
    //Anadir libros

    public void addBook(String book) {
        books.add(book);
    }
    
    //Verificar si el libro esta disponible

    public void callBook(String book, String user) {
        if (books.contains(book)) {
            books.remove(book);
            cantidadLibros++;
            System.out.println("Libro usado: " + book + " por " + user);
            System.out.println("Numero de libros usados: " + cantidadLibros);
            System.out.println("---------");
        } else {
            System.out.println("Libro no disponible: " + book);
            System.out.println("---------");
        }
    }

    public List<String> LibroDisponible() {
        return new ArrayList<>(books);
    }

    public void mostrarLibro() {
        System.out.println("Available books: " + books);
    }
}
