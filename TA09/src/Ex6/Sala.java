package Ex6;

import java.util.Random;

//Heredamos de la clase Cine 
public class Sala extends Cine {

	// Atributos //
	private Pelicula pelicula;

	private double precio;

	private Espectador asientos[][];

	private int asientosOcupados;

	private boolean lleno;

	// Constructor //
	public Sala(Pelicula pelicula, double precio) {
		this.pelicula = pelicula;
		this.precio = precio;
		this.asientos = new Espectador[8][9];
		this.asientosOcupados = 0;
		this.lleno = false;
	}

	// Getters y Setters //
	public double getPrecio() {
		return precio;
	}

	// Funcion que asigna un asiento en un espectador comprobando si cualifica y si
	// hay disponibilidad
	public String asignarAsiento(Espectador e) {

		if (this.lleno) { // Si la sala esta llena directamente retornamos que no hay sitio
			return "Lo sentimos, la sala está llena.";
		} else { // Si hay sitio realizamos el resto de comprobaciones
			if (e.getEdad() < this.pelicula.getEdadMinima()) { // Comprobamos si el usuario tiene la edad minima para
																// ver la pelicula
				return "Lo sentimos, tienes " + e.getEdad() + " años y necesitas tener " + this.pelicula.getEdadMinima()
						+ " años para ver esta película";
			}
			if (e.getDinero() < this.getPrecio()) { // Vemos si el espectador tiene dinero suficiente para comprar la
													// entrada.
				return "Lo sentimos, tienes " + e.getDinero() + " euros y necesitas " + this.getPrecio()
						+ " para la entrada";
			}

			// Si tiene edad suficiente y dinero suficiente se ejecuta el codigo para
			// asignarle asiento.
			boolean continuar = true;
			Random rand = new Random();
			int x = 0;
			int y = 0;
			String letras = "ABCDEFGHI";
			while (continuar) {
				// generamos dos numeros random x e y que nos indicarán en que asientos se
				// colocaria a nuestro usuario
				x = rand.nextInt(8);
				y = rand.nextInt(9);
				if (this.asientos[x][y] == null) { // Comprobamos que el asiento que se ha elegido NO tiene a un usuario
													// ya.
					continuar = false;
					this.asientos[x][y] = e; // asignamos el espectador a los asientos
					this.asientosOcupados++; // incrementamos el numero de asientos ocupados en la sala
					if (this.asientosOcupados == (8 * 9)) { // Si el numero de asientos ocupados es igual al de asientos
															// que hay en la sala el proximo espectador no podrá comprar
															// una entrada
						lleno = true;
					}
				}
			}
			return "Te hemos asignado el asiento: " + (x + 1) + " " + letras.charAt(y);
		}

	}

}
