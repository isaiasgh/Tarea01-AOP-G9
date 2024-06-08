package main;

import java.util.Scanner;

public class Usuario {
    private final String name;
   private String libro;

    public Usuario(String name) {
        this.name = name;
   
    }

    public void eleccion() {
    	   Libreria library = Libreria.getInstance();
    	    Scanner scanner = new Scanner(System.in);

    	    library.mostrarLibro();

    	    System.out.println("Ingresa el libro que deseas conocer");
    	    String book = scanner.nextLine();
    	    
    	    library.LibroDisponible().remove(book);
    	    library.callBook(book, name);
    	    this.libro = book; // Guarda el libro seleccionado en el objeto Usuario
    	    


    }

    public void showRole() {
        System.out.println("User: " + name );
    }
    
    public String getlibro() {
    	return this.libro;
    }
}
