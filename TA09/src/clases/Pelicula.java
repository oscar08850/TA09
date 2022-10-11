package clases;

public class Pelicula {
	
	
	// Atributos //
	private String titulo;
	
	private int duracion;
	
	private int edadMinima;
	
	private String director;

	// Constructor //
	public Pelicula(String titulo, int duracion, int edadMinima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}

	// Getters y Setters //

	public int getEdadMinima() {
		return edadMinima;
	}
	

}
