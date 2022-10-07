import java.util.Random;

public class Cine {
	
	private Pelicula pelicula;
	
	private double precio;
	
	private Espectador asientos[][];
	
	private int asientosOcupados;
	
	private boolean lleno;

	public Cine(Pelicula pelicula, double precio) {
		this.pelicula = pelicula;
		this.precio = precio;
		this.asientos = new Espectador[8][9];
		this.asientosOcupados = 0;
		this.lleno = false;
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
	
	public String asignarAsiento(Espectador e) {
		
		if(this.lleno) {
			return "Lo sentimos, la sala está llena.";
		}else {
			if( e.getEdad() < this.pelicula.getEdadMinima() ) {
				return "Lo sentimos, tienes "+e.getEdad()+" años y necesitas tener "+this.pelicula.getEdadMinima()+" años para ver esta película" ;
			}
			if( e.getDinero() < this.getPrecio() ) {
				return "Lo sentimos, tienes "+e.getDinero()+" euros y necesitas "+this.getPrecio()+" para la entrada";
			}
			
			boolean continuar = true;
			Random rand = new Random();
			int x = 0;
			int y = 0;
			String letras = "ABCDEFGHI";
			while(continuar) {
				x = rand.nextInt(8);
				y = rand.nextInt(9);
				if(this.asientos[x][y] == null) {
					continuar = false;
					this.asientos[x][y] = e;
					this.asientosOcupados++;
					if(this.asientosOcupados == (8*9)) {
						lleno = true;
					}
				}	
			}
			return "Te hemos asignado el asiento: "+x+" "+letras.charAt(y);
		}
		
		
	}
	
			
	
	
	
	

}
