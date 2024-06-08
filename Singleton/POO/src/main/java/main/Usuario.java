package main;

import java.util.Scanner;

public class Usuario {
    private final String name;
   

    public Usuario(String name) {
        this.name = name;
   
    }

    public void eleccion() {
        Libreria library = Libreria.getInstance();
        Scanner scanner = new Scanner(System.in);

        library.mostrarLibro();

        System.out.println("Ingresa el libro que deseas conocer");
        String book = scanner.nextLine();
        library.callBook(book, name);
    }

    public void showRole() {
        System.out.println("User: " + name );
    }
}
