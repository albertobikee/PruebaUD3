package libro;

//Clase que representa un libro en la biblioteca
public class Libro {
 public String titulo;
 public int anioPublicacion;
 public String ISBN;
 public String genero;
 public boolean prestado;

 public Libro(String titulo, int anioPublicacion, String ISBN,String genero) {
     this.titulo = titulo;
     this.anioPublicacion = anioPublicacion;
     this.ISBN=ISBN;
     this.genero=genero;
     this.prestado=false;
 }

 public void prestar() {
     if (!prestado) {
         prestado = true;
         System.out.println(titulo + " ha sido prestado.");
     } else {
         System.out.println(titulo + " ya está prestado.");
     }
 }

 public void devolver() {
     if (prestado) {
         prestado = false;
         System.out.println(titulo + " ha sido devuelto.");
     } else {
         System.out.println(titulo + " no estaba prestado.");
     }
 }
}
