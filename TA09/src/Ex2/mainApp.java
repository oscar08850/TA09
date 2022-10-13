package Ex2;
public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];
		FuncionesAuxiliares aux = new FuncionesAuxiliares();
		
		series[0] = new Serie("Breaking bad", 5, true, "drama", "Vince Gilligan");
		series[1] = new Serie("Game of Thrones", 8, false, "fantasía", "Weiss y Benioff");
		series[2] = new Serie("Smallville", 10, false, "superheroes", "Justin Hartley");
		series[3] = new Serie("The office", 9, false, "comedia", "Steve Carell");
		series[4] = new Serie("Star Trek: The Next Generation", 8, true, "ciencia ficción", "Gene Roddenberry");
		
		videojuegos[0] = new Videojuego("The Witcher 3", 100, false, "RPG", "CD projekt");
		videojuegos[1] = new Videojuego("Bioshock", 60, false, "acción", "2K games");
		videojuegos[2] = new Videojuego("Hollow Knight", 120, false, "acción", "Team Cherry");
		videojuegos[3] = new Videojuego("Animal Crossing", 80, false, "simulación", "Nintendo");
		videojuegos[4] = new Videojuego("Escape From Tarkov", 100, true, "FPS", "Battlestate Games");
		
		series[1].entregar();
		series[2].entregar();
		videojuegos[0].entregar();
		videojuegos[1].entregar();
		
		aux.seriesEntregadas(series);
		aux.videojuegosEntregados(videojuegos);
		
		aux.serieConMasTemporadas(series);
		aux.videojuegoConMasHoras(videojuegos);
		
		
		
		
		
	}

}
