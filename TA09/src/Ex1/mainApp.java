package Ex1;

import java.util.ArrayList;
import Ex1.FuncionesAuxiliares;

public class mainApp {

	public static void main(String[] args) {

		// ArrayList<Electrodomestico> ListaElectrodomesticos = new ArrayList<>();

		Electrodomestico arrayElectrodomestico[] = new Electrodomestico[10];

		
		int precioTotalElectrodomesticos = 0;
		int precioTotalLavadoras = 0;
		int precioTotalTelevisores = 0;
		Electrodomestico[] electrodomesticos = rellenarElectrodomesticos();

		// sumamos el precio total separando según sea electrodoméstico general,
		// televisor o lavadora
		for (int i = 0; i < electrodomesticos.length; i++) {
			if (electrodomesticos[i] instanceof Electrodomestico) {
				precioTotalElectrodomesticos += electrodomesticos[i].precioFinal();
			}
			if (electrodomesticos[i] instanceof Lavadora) {
				precioTotalLavadoras += electrodomesticos[i].precioFinal();
			} else if (electrodomesticos[i] instanceof Television) {
				precioTotalTelevisores += electrodomesticos[i].precioFinal();
			}

		}

		System.out.println("El precio de los electrodomésticos es: " + precioTotalElectrodomesticos + "euros");
		System.out.println("El precio de las lavadoras es: " + precioTotalLavadoras + "euros");
		System.out.println("El precio de los televisiones es: " + precioTotalTelevisores + "euros");

	}


}
