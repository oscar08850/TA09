package Ex5;

import java.util.Random;

public class Profesor extends Persona{
	
	//Atributo
	protected String materia;

	public Profesor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo);
		this.materia = materia;
		this.asistencia = asistencia();
	}

	@Override
	public boolean asistencia() {

		Random r = new Random();
		int asistio = r.nextInt(100);
		
		if(asistio >= 21)
			return true;
		else return false;
		
	}

	public String getMateria() {
		return materia;
	}
	
	
	

}
