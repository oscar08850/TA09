
public class mainAPP {

	public static void main(String[] args) {

		Espectador e1 = new Espectador("Pepito Grillo", 18, 20.20);
		
		Pelicula p1 = new Pelicula("Malditos Bastardos", 180, 18, "Quentin Tarantino");
		
		Cine c1 = new Cine(p1, 10.50);
		
		System.out.println(c1.asignarAsiento(e1));
		
		
	}

}
