package Ex4;

import java.util.ArrayList;

public class Raices {
	
	//atributos
	private double a;
	
	private double b;
	
	private double c;

	//declaro el constructor
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//me devuelve el discriminante
	public double getDiscriminante() {
		return (Math.pow(this.b, 2))-4*this.a*this.c;
	}
	
	//si tiene dos posibles soluciones (discriminante mayor que 0) devuelve true, de lo contrario devuelve false
	public boolean tieneRaices() {
		if(this.getDiscriminante() > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//si tiene una sola posible solución (discriminante igual a 0) devuelve true, de lo contrario devuelve false
	public boolean tieneRaiz() {
		if(this.getDiscriminante() == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//calcula el resultado/s de la ecuación si es posible y lo/s muestra por pantalla, si no hay resultado indica que no tiene solucion
	public void calcular() {
		double a = this.a;
		double b = this.b;
		double c = this.c;
		ArrayList<Double> soluciones = new ArrayList<Double>();
		//si tiene dos soluciones
		if(this.tieneRaices()) {
			soluciones.add( ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a) );
			soluciones.add( ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a) );
			System.out.println("Solución 1 = "+soluciones.get(0));
			System.out.println("Solución 2 = "+soluciones.get(1));
		}else if(this.tieneRaiz()) { //else if tiene una sola solución
			soluciones.add( ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a) );
			System.out.println("Solución = "+soluciones.get(0));
		}else { //else no tiene solución
			System.out.println("No hay soluciones para esta ecuación");
		}
	}
	
	//muestra por pantalla las soluciones, en caso de tener solo 1 solución o ninguna devuelve error
	public void obtenerRaices() {
		ArrayList<Double> soluciones = new ArrayList<Double>();
		if(this.tieneRaices()) {
			soluciones.add( ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a) );
			soluciones.add( ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a) );
			System.out.println("Solución 1 = "+soluciones.get(0));
			System.out.println("Solución 2 = "+soluciones.get(1));
		}else {
			System.out.println("Error, no tiene dos soluciones");
		}
	}
	
	//muestra por pantalla la solución, en caso de tener 2 soluciones o ninguna solución devuelve error
	public void obtenerRaiz() {
		ArrayList<Double> soluciones = new ArrayList<Double>();
		if(this.tieneRaiz()) {
			soluciones.add( ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a) );
			System.out.println("Solución = "+soluciones.get(0));
		}else if(this.tieneRaices()) {
			System.out.println("Error, tiene dos soluciones pruebe a usar tieneRaices()");
		}
		else {
			System.out.println("Error, no tiene solución");
		}
	}
	
	
}
