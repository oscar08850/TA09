package Ex1;

public class FuncionesAuxiliares {

	// creamos electrodomésticos, televisores lavadoras
	

	
	public Electrodomestico[] rellenarElectrodomesticos() {
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		electrodomesticos[0] = new Electrodomestico(85, "Negro", 'D', 60);
		electrodomesticos[1] = new Television(15, "Azul", 'E', 60, 15, false);
		electrodomesticos[2] = new Electrodomestico(110, "Gris", 'B', 25);
		electrodomesticos[3] = new Television(30, "Rojo", 'A', 20, 35, true); //
		electrodomesticos[4] = new Lavadora(100, "Azul", 'D', 20, 30);
		electrodomesticos[5] = new Electrodomestico(150, "Blanco", 'F', 80);
		electrodomesticos[6] = new Electrodomestico(250, "Rojo", 'C', 70);
		electrodomesticos[7] = new Lavadora(97, "Gris", 'C', 50, 5);
		electrodomesticos[8] = new Television(110, "Negro", 'B', 35, 15, false);
		electrodomesticos[9] = new Electrodomestico(125, "Blanco", 'F', 30);

		return electrodomesticos;
	}
}