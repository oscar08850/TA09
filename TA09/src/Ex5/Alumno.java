package Ex5;

import java.util.Random;

public class Alumno extends Persona{
	
	//Atributos
	protected int nota;
	
	public Alumno(String nombre, int edad, char sexo, int nota) {
		super(nombre, edad, sexo);
		this.nota = nota;
		this.asistencia = asistencia();
	}
	
	public int getNota() {
		return nota;
	}

	@Override
	public boolean asistencia() {

		Random r = new Random();
		int asistio = r.nextInt(100);
		
		if(asistio >= 51)
			return true;
		else return false;
	}
	
	@Override
	public String toString() {
		if(asistencia)
			return  nombre + " con nota " + nota + " y edad " + edad + ", asistio";
		else return  nombre + " con nota " + nota + " y edad " + edad + ", NO asistio";
	}


}
