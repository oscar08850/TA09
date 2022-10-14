package Ex1;

import java.util.ArrayList;
import Ex1.FuncionesAuxiliares;

public class mainApp {

	public static void main(String[] args) {


		FuncionesAuxiliares aux = new FuncionesAuxiliares();
		Electrodomestico arrayElectrodomestico[] = new Electrodomestico[10];

		
		double precioTotalElectrodomesticos = 0;
		double precioTotalLavadoras = 0; 
		double precioTotalTelevisores = 0;
		Electrodomestico[] electrodomesticos = aux.rellenarElectrodomesticos();

		// sumamos el precio total separando según sea electrodoméstico general,
		// televisor o lavadora
		for (int i = 0; i < electrodomesticos.length; i++) {
			if (electrodomesticos[i] instanceof Electrodomestico) {
				precioTotalElectrodomesticos = precioTotalElectrodomesticos + electrodomesticos[i].precioFinal();
			}
			if (electrodomesticos[i] instanceof Lavadora) {
				precioTotalLavadoras = precioTotalLavadoras + electrodomesticos[i].precioFinal();
			} else if (electrodomesticos[i] instanceof Television) {
				precioTotalTelevisores = precioTotalTelevisores + electrodomesticos[i].precioFinal();
			}

		}

		System.out.println("El precio de los electrodomésticos es: " + precioTotalElectrodomesticos + " euros");
		System.out.println("El precio de las lavadoras es: " + precioTotalLavadoras + " euros");
		System.out.println("El precio de los televisores es: " + precioTotalTelevisores + " euros");

	}


}
