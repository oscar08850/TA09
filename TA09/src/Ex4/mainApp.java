package Ex4;

public class mainApp {

	public static void main(String[] args) {
		//instancio los objetos Raices
		Raices raiz1 = new Raices(-5, 20, 15);
		Raices raiz2 = new Raices(1, -4, 4);
		//muestro el discriminante
		System.out.println(raiz1.getDiscriminante());
		System.out.println(raiz2.getDiscriminante());
		//llamo a los métodos obtenerRaices() y obtenerRaiz() para cada uno de los objetos instanciados
		raiz1.obtenerRaices();
		raiz1.obtenerRaiz();
		raiz2.obtenerRaices();
		raiz2.obtenerRaiz();

	}

}
