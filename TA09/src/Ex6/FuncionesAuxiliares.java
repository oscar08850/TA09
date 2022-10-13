package Ex6;

import java.util.Random;

public class FuncionesAuxiliares {

	private static int dameRandom(int min, int max) { // Genera un numero random entre min y max

		Random random = new Random();
		int numero = 0;
		numero = random.nextInt(max - min + 1) + min;
		return numero;
	}

	public static void generaEspectadores(Sala sala) { // Genera espectadores hasta que la sala se llena.
		int espectadores = 0;
		int edad = 0;
		String retorno = "";
		double dinero = 0;
		boolean continuar = true;
		while (continuar) {
			edad = dameRandom(17, 22);
			dinero = dameRandom(10, 20);
			retorno = sala.asignarAsiento(new Espectador("Prueba", edad, dinero)); // Asigna espectadores con edad y
																					// dinero generados aleatoriamente
			System.out.println(retorno);
			if (retorno.contains("Te hemos asignado el asiento")) { //Si el usuario se asigna se incrementa el numero de espectadores en la sala
				espectadores++;
			} else if (retorno.contains("Lo sentimos, la sala está llena.")) { // Si la sala esta llena salimos del while.
				continuar = false;

			}
		}

	}

}
