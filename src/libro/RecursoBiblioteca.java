package libro;

public class RecursoBiblioteca {

	protected boolean prestado;
	public String autor;

	public RecursoBiblioteca() {
		super();
	}

	protected void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public int getAñoPublicacion() {
		return getAñoPublicacion();
	}

	protected void setAñoPublicacion(int añoPublicacion, Libro libro) {
		libro.añoPublicacion = añoPublicacion;
	}

	public String getTitulo() {
		return getTitulo();
	}

	protected void setTitulo(String titulo, Libro libro) {
		libro.titulo = titulo;
	}

}