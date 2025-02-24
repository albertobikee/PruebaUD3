package paquete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        
        System.out.print("Ingrese el año de publicación: ");
        int anioPublicacion = scanner.nextInt();
        
        System.out.print("Ingrese el ISBN: ");
        String ISBN = scanner.nextLine();
        
        System.out.print("Ingrese el género: ");
        String genero = scanner.nextLine();

        Libro libro = new Libro(titulo, anioPublicacion,ISBN, genero);
        
        System.out.println("\nDetalles del libro:");
        System.out.println("Título: " + libro.titulo);
        System.out.println("Año de publicación: " + libro.anioPublicacion);
        System.out.println("ISBN: " + libro.ISBN);
        System.out.println("Género: " + libro.genero);
        
        System.out.print("¿Desea prestar el libro? (s/n): ");
        char opcion = scanner.next().charAt(0);
        if (opcion == 's' || opcion == 'S') {
            libro.prestar();
        }

        System.out.print("¿Desea devolver el libro? (s/n): ");
        opcion = scanner.next().charAt(0);
        if (opcion == 's' || opcion == 'S') {
            libro.devolver();
        }

        scanner.close();
    }
    
  
}
