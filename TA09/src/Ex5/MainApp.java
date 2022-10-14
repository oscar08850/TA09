package Ex5;

public class MainApp {

	public static void main(String[] args) {
		
		Aula[] aulas = FuncionesAuxiliares.inicializarAulas();
		Profesor[] profes = FuncionesAuxiliares.inicializarProfesores();
		Alumno[] alumnos = FuncionesAuxiliares.inicializarAlumnos();

		// Imprimimos las clases del d�a
		// Metodos.imprimirHayClases(aulas, profes, alumnos);
		FuncionesAuxiliares.mostrarClases(aulas, profes, alumnos);
		

		// Imprimimos los alumnos dividos por g�neros
		FuncionesAuxiliares.alumnosGenero(alumnos);

	}

}
