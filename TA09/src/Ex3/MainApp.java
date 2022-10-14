package Ex3;

public class MainApp {

	public static void main(String[] args) {

		Libro l1 = new Libro("976-05-92833-82-934", "Los pilares de la tierra", "Ken Follet", 1274);
		System.out.println(l1.toString());
		
		Libro l2 = new Libro("123-98-23745-77-112", "El imperio final", "Brandon Sanderson", 1422);
		System.out.println(l2.toString());
		
		String masPags = FuncionesAuxiliares.masPaginas(l1,l2);
		System.out.println("El libro con mas paginas es: " +masPags);

	}

}
