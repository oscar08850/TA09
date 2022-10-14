package Ex5;

import java.util.ArrayList;

public class FuncionesAuxiliares {
	

		public static Aula[] inicializarAulas() {							//Inicialización aulas
			Aula[] clase = new Aula[3];
			clase[0] = new Aula(1, 8, Materias.filosofia.toString());
			clase[1] = new Aula(2, 10, Materias.fisica.toString());
			clase[2] = new Aula(3, 15, Materias.matematicas.toString());

			return clase;
		}


		public static Profesor[] inicializarProfesores() {					//Inicialización profesores
			Profesor[] profesor = new Profesor[3];
			profesor[0] = new Profesor("Marcos", 28, 'H', Materias.matematicas.toString());
			profesor[1] = new Profesor("Juana", 30, 'M', Materias.filosofia.toString());
			profesor[2] = new Profesor("Violeta", 54, 'M', Materias.fisica.toString());

			return profesor;
		}


		public static Alumno[] inicializarAlumnos() {						//Inicialización alumnos
			Alumno[] alumno = new Alumno[10];

			alumno[0] = new Alumno("Eva", 11, 'M', 5);
			alumno[1] = new Alumno("Hector", 13, 'H', 7);
			alumno[2] = new Alumno("Carla", 12, 'M', 8);
			alumno[3] = new Alumno("Juanjo", 15, 'H', 2);
			alumno[4] = new Alumno("Anna", 11, 'M', 6);
			alumno[5] = new Alumno("Marta", 12, 'M', 9);
			alumno[6] = new Alumno("Paco", 13, 'H', 4);
			alumno[7] = new Alumno("Sara", 14, 'M', 6);
			alumno[8] = new Alumno("Javier", 15, 'H', 10);
			alumno[9] = new Alumno("Francisco", 13, 'H', 8);

			return alumno;
		}
		
		public static void mostrarClases(Aula aulas[], Profesor profes[], Alumno alumnos[]) {	//metodo que imprime las clases

			for (int i = 0; i < profes.length; i++) {	//bucle recorriendo array de profesores
				
				for (int j = 0; j < aulas.length; j++) {	//bucle recorriendo array de aulas
					
					if (profes[i].getMateria().equals(aulas[j].getMateria())) {	//si la materia del profesor equivale a la aula en que se imparte
						
						if (aulas[j].hayClases(alumnos, profes[i])) {	//miramos si se puede hacer clase en esa aula (asistencia) y llamamos a mostrarAula
							
							mostrarAula(aulas, profes, alumnos, j);
							
						} else {	//si no hay clase, lo imprimimos
							
							System.out.println("En el aula " +(j+1) + ", no hay clase de "+ profes[i].getMateria());
							
						}
					}
				}
			}
		}
		
		public static void mostrarAula(Aula aulas[], Profesor profesores[], Alumno alumnos[], int indice) {	//metodo que muestra el contenido de las aulas en las que hay clase
			System.out.println("Aula: "+ (indice+1));
			System.out.println("Asignatura: "+aulas[indice].getMateria());
			
			for (int i = 0; i < profesores.length; i++) {	//bucle recorriendo profesores
				
				if(aulas[indice].getMateria().equals(profesores[i].getMateria())) {	
					System.out.println("Profesor: "+profesores[i].getNombre());	//imprimimos los profesores de la materia
					
				}
			}
			
			System.out.println("Alumnos: ");
			
			for (int i = 0; i < aulas[indice].getMaxEstudiantes(); i++) {	//bucle recorriendo alumnos
				
				System.out.println(alumnos[i].toString());	//imprimimos alumnos
			}
			
		}
		

		public static void alumnosGenero (Alumno alumnos[]) {	//metodo para imprimir los alumnos por genero
			
			ArrayList<Alumno> chicos = new ArrayList<>();	//creamos arrays para chicos y chicas
			ArrayList<Alumno> chicas = new ArrayList<>();
			
			for(int i = 0; i<alumnos.length; i++) {	//bucle de iteracion en alumnos
				
				if(alumnos[i].getSexo() == 'H') {	//si sexo es H, añadimos a chicos
					chicos.add(alumnos[i]);
				} else {							//sino, añadimos a chicas (no controlamos otra salidad que no sea H o M)
					chicas.add(alumnos[i]);
				}
			}
			
			System.out.println("\nAlumnos");	//mostramos alumnos y alumnas por pantalla, si estan aprobados
			chicos.forEach((alumno)->{
				
				if(alumnosAprobados(alumno)) {
					System.out.println(alumno.toString());
				}
				
			});
			
			System.out.println("\nAlumnas");
			chicas.forEach((alumna)->{
				if(alumnosAprobados(alumna)) {
				System.out.println(alumna.toString());
				}
			});
		}
		
		
		public static boolean alumnosAprobados(Alumno alumno) {
			
			boolean aprobado = true;
			
			if(alumno.getNota()>=5) {	//si nota es mayor o igual a 5, aprobados
				aprobado = true;
			}else {
				aprobado=false;
			}
			return aprobado;
		}

}
