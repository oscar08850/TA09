import java.util.ArrayList;

public class Cine {
	
	protected Pelicula pelicula;
	
	protected double precio;
	
	protected Espectador asientos[][];

	public Cine(Pelicula pelicula, double precio) {
		this.pelicula = pelicula;
		this.precio = precio;
		this.asientos = new Espectador[8][9];
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Espectador[][] getAsientos() {
		return asientos;
	}

	public void setAsientos(Espectador[][] asientos) {
		this.asientos = asientos;
	}
	
	
			
	
	
	
	

}
