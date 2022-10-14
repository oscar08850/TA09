package Ex5;


public class Aula {

	protected int idAula;
	
	protected int maxEstudiantes;
	
	protected String materia;

	public Aula(int idAula, int maxEstudiantes, String materia) {
		this.idAula = idAula;
		this.maxEstudiantes = maxEstudiantes;
		this.materia = materia;
	}
	
	public String getMateria() {
		return materia;
	}

	public int getMaxEstudiantes() {
		return maxEstudiantes;
	}
	
	public boolean hayClases(Alumno[] alumnos, Profesor profesor) {	//metodo que nos indica si hay clases a traves de un booleano

		if(profesor.asistencia) {	//si el profesor asiste
			
			int totalAlumnos = maxEstudiantes;
			int alumnosEnClase = 0;
			
			for(Alumno alumno : alumnos) {	//bucle recorriendo los alumnos e incrementando alumnosEnClase por cada uno que asista
				if(alumno.asistencia)
					
					alumnosEnClase++;
			}
			
			int alumnosClasePorciento = alumnosEnClase*100/totalAlumnos;	//calculo porcentaje asistencia
			
			if(alumnosClasePorciento>=50) {
				
				return true;
				
			} else {
				
				return false;
				
			}
			
		} else {
			
			return false;
			
		}
	}

		
}
