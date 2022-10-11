import clases.Pelicula;
import clases.Sala;
import clases.FuncionesAuxiliares;

public class mainAPP {

	public static void main(String[] args) {

		Pelicula p1 = new Pelicula("Malditos Bastardos", 180, 18, "Quentin Tarantino");

		Sala c1 = new Sala(p1, 10.50);
		
		
		FuncionesAuxiliares.generaEspectadores(c1);
		

	}

}
