package Ex1;

import Ex1.Color;
import Ex1.ConsumoElectrico;

public class Electrodomestico {
	// Atributos//

	protected double precioBase;

	protected String color;

	protected char consumoEnergetico;

	protected double peso;
	
	 
	/// Variables por defecto ///
	
	private final double PRECIO_BASE = 100;
	
	private final String COLOR = "Blanco";

	private final char CONSUMO_ENERGETICO = 'F';

	private final double PESO = 5;
	

	// Constructores ///
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = PESO;
	}

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	private char comprobarConsumoEnergetico(char consumoEnergetico) {
		switch (consumoEnergetico) {
		case 'A':
			return ConsumoElectrico.A.consumo;
		case 'B':
			return ConsumoElectrico.B.consumo;
		case 'C':
			return ConsumoElectrico.C.consumo;
		case 'D':
			return ConsumoElectrico.D.consumo;
		case 'E':
			return ConsumoElectrico.E.consumo;
		case 'F':
			return ConsumoElectrico.F.consumo;
		default:
			return ConsumoElectrico.F.consumo;
		}
	}

	private String comprobarColor(String color) {
		if (color.equals(Color.Azul.toString())) {

			return color;
		} else if (color.equals(Color.Blanco.toString())) {
			return color;
		} else if (color.equals(Color.Gris.toString())) {
			return color;
		} else if (color.equals(Color.Negro.toString())) {
			return color;
		} else if (color.equals(Color.Rojo.toString())) {
			return color;
		} else {
			return "Blanco";
		}

	}

	public double precioFinal() { //Falta usarla
		double precioFinal = getPrecioBase();
		double peso = getPeso();

		switch (getConsumoEnergetico()) {
		case 'A':
			precioFinal = precioFinal + 100;
			break;
		case 'B':
			precioFinal = precioFinal + 80;
			break;
		case 'C':
			precioFinal = precioFinal + 60;
			break;
		case 'D':
			precioFinal = precioFinal + 50;
			break;
		case 'E':
			precioFinal = precioFinal + 30;
			break;
		case 'F':
			precioFinal = precioFinal + 10;
			break;
		default:
			break;
		}

		// Lo hacemos con if porque el switch no permite usar double.
		if (getPeso() >= 80) {
			precioFinal = precioFinal + 100;
		} else if (getPeso() >= 50) {
			precioFinal = precioFinal + 80;
		} else if (getPeso() >= 20) {
			precioFinal = precioFinal + 50;
		} else if (getPeso() >= 0) {
			precioFinal = precioFinal + 10;
		}

		return precioFinal;

	}
	/// Getters y setters ///

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	/// Método toString() ///
	@Override
	public String toString() {
		String mensaje = "Precio base: " + this.precioBase + "\nColor: " + this.color + "\nConsumo Electrico: "
				+ this.consumoEnergetico + "\nPeso: " + this.peso + "\n";
		return mensaje;
	}

}
