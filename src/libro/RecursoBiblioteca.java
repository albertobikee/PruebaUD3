package libro;

public class RecursoBiblioteca {

	protected boolean prestado;
	public String autor;

	public RecursoBiblioteca() {
		super();
	}

	protected void setPrestado(boolean prestado, RecursoBiblioteca libro) {
		this.prestado = prestado;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	protected void setAñoPublicacion(int añoPublicacion, Libro libro) {
		libro.añoPublicacion = añoPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	protected void setTitulo(String titulo, Libro libro) {
		libro.titulo = titulo;
	}

}