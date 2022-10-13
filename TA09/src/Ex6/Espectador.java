package Ex6;

public class Espectador {
	
	// Atributos //
	private String nombre;
	
	private int edad;
	
	private double dinero;

	// Constructor //
	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	// Getters y Setters //
	public int getEdad() {
		return edad;
	}


	public double getDinero() {
		return dinero;
	}

	
}
