package Ex2;

public class FuncionesAuxiliares {

	public void seriesEntregadas(Serie[] series) {
		int entregados = 0;
		
		for(int i = 0; i < series.length; i++) {
			if(series[i].isEntregado()) {
				entregados++;
				series[i].devolver();
			}
		}
		
		System.out.println("Hay "+entregados+" series entregadas");
	}
	
	public void videojuegosEntregados(Videojuego[] videojuegos) {
		int entregados = 0;
		
		for(int i = 0; i < videojuegos.length; i++) {
			if(videojuegos[i].isEntregado()) {
				entregados++;
				videojuegos[i].devolver();
			}
		}
		
		System.out.println("Hay "+entregados+" videojuegos entregados");
	}
	
	public void serieConMasTemporadas(Serie[] series) {
		//de primeras asigno la primera posición del array de series como la que tiene más temporadas
		Serie mastemporadas = series[0];
		
		//luego comparo las siguientes series y si tienen más temporadas que la guardada en la variable mastemporadas, se asigna a la variable
		for(int i = 1; i < series.length; i++) {
			if(series[i].getTemporadas() > mastemporadas.getTemporadas()) {
				mastemporadas = series[i];
			}
		}
		
		System.out.println("Serie con más temporadas: "+ mastemporadas.toString());
	}
	
	public void videojuegoConMasHoras(Videojuego[] videojuegos) {
		//de primeras asigno la primera posición del array de series como la que tiene más temporadas
		Videojuego mashoras = videojuegos[0];
		
		//luego comparo las siguientes series y si tienen más temporadas que la guardada en la variable mastemporadas, se asigna a la variable
		for(int i = 1; i < videojuegos.length; i++) {
			if(videojuegos[i].getHoras() > mashoras.getHoras()) {
				mashoras = videojuegos[i];
			}
		}
		
		System.out.println("Videojuego con más horas: " + mashoras.toString());
	}
}
