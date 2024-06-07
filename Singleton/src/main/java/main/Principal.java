package main;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Libreria libros = Libreria.getInstance();

     
        libros.addBook("1984 by George Orwell");
        libros.addBook("To Kill a Mockingbird by Harper Lee");
        libros.addBook("The Great Gatsby by F. Scott Fitzgerald");
        libros.addBook("One Hundred Years of Solitude by Gabriel Garcia Marquez");
        libros.addBook("Moby Dick by Herman Melville");

   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre:");
        String userName = scanner.nextLine();

        Usuario user = new Usuario(userName);
        
        
        
        while (!libros.LibroDisponible().isEmpty()) {
        	 
        	 user.eleccion();
        }

        libros.LibroDisponible();
       
        
        
    }

}
