package Ex4;

import java.util.ArrayList;

public class Raices {
	
	private double a;
	
	private double b;
	
	private double c;

	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getDiscriminante() {
		return (Math.pow(this.b, 2))-4*this.a*this.c;
	}
	
	public boolean tieneRaices() {
		if(this.getDiscriminante() > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean tieneRaiz() {
		if(this.getDiscriminante() == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void calcular() {
		double a = this.a;
		double b = this.b;
		double c = this.c;
		ArrayList<Double> soluciones = new ArrayList<Double>();
		if(this.tieneRaices()) {
			soluciones.add( ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a) );
			soluciones.add( ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a) );
			System.out.println("Solución 1 = "+soluciones.get(0));
			System.out.println("Solución 2 = "+soluciones.get(1));
		}else if(this.tieneRaiz()) {
			soluciones.add( ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a) );
			System.out.println("Solución = "+soluciones.get(0));
		}else {
			System.out.println("No hay soluciones para esta ecuación");
		}
	}
	
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
