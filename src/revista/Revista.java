package revista;

import libro.RecursoBiblioteca;

public class Revista extends RecursoBiblioteca {
	
	String titulo;
	 int añoPublicacion;
	 public String ISBN;
	 public String genero;
	 int numeroEdicion;
	 
	 public Libro(String titulo, int anioPublicacion, String ISBN,String genero) {
	     super();
		this.setTitulo(titulo, this);
	     this.setAñoPublicacion(anioPublicacion, this);
	     this.ISBN=ISBN;
	     this.genero=genero;
	     this.setPrestado(false);
	 }

	 public void prestar() {
	     if (!isPrestado()) {
	         setPrestado(true);
	         System.out.println(getTitulo() + " ha sido prestado.");
	     } else {
	         System.out.println(getTitulo() + " ya está prestado.");
	     }
	 }

	 public void devolver() {
	     if (isPrestado()) {
	         setPrestado(false);
	         System.out.println(getTitulo() + " ha sido devuelto.");
	     } else {
	         System.out.println(getTitulo() + " no estaba prestado.");
	     }
	 }

	private boolean isPrestado() {
		return prestado;
	}
	}