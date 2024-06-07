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
    
    //Numero de libros

    public void callBook(String book, String user) {
        if (books.contains(book)) {
            cantidadLibros++;
            System.out.println("Numero de libros usados: " + cantidadLibros);
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
