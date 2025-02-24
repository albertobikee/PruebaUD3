package biblioteca;

import java.util.Scanner;

import libro.Libro;

/** 
 * Clase principal del proyecto.
 * 
 * @author Alberto Hernández
 * @version 1.0
 * @since 2025
 * */
public class Main {
    /**
     * Método principal que ejecuta el programa de la biblioteca.
     * 
     * @param args
     */
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
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Año de publicación: " + libro.getAñoPublicacion());
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
