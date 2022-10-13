package Ex4;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Raices raiz1 = new Raices(-5, 20, 15);
		Raices raiz2 = new Raices(1, -4, 4);
		System.out.println(raiz1.getDiscriminante());
		System.out.println(raiz2.getDiscriminante());
		raiz1.obtenerRaices();
		raiz1.obtenerRaiz();
		raiz2.obtenerRaices();
		raiz2.obtenerRaiz();

	}

}
