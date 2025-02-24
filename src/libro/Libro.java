package libro;

/** 
 * Clase que representa un libro en la biblioteca.
 * 
 * @author Alberto Hernández
 * @version 1.0
 * @since 2025
 * */
public class Libro extends RecursoBiblioteca {
	
 String titulo;
 int añoPublicacion;
 public String ISBN;
 public String genero;
 public Libro(String titulo, int anioPublicacion, String ISBN,String genero) {
     super();
	this.setTitulo(titulo, this);
     this.setAñoPublicacion(anioPublicacion, this);
     this.ISBN=ISBN;
     this.genero=genero;
     this.setPrestado(false, this);
 }

 /** 
  * 
  * Este método pronto dejará de utilizarse...
  * 
  * @deprecated 
  * 
  * */
 public void prestar() {
	 /** 
	  * 
	  * @param args
	  * @return
	  * 
	  * */
     if (!isPrestado()) {
         setPrestado(true, null);
         System.out.println(getTitulo() + " ha sido prestado.");
     } else {
         System.out.println(getTitulo() + " ya está prestado.");
     }
 }


 public void devolver() {
	 /** 
	  * 
	  * @return
	  * 
	  * */
     if (isPrestado()) {
         setPrestado(false, null);
         System.out.println(getTitulo() + " ha sido devuelto.");
     } else {
         System.out.println(getTitulo() + " no estaba prestado.");
     }
 }

private boolean isPrestado() {
	 /** 
	  * 
	  * @return
	  * 
	  * */
	return prestado;
}
}
