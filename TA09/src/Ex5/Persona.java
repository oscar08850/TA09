package Ex5;

public abstract class Persona {
	
	//Atributos
	protected String nombre;
	
	protected int edad;
	
	protected char sexo;
	
	protected boolean asistencia;

	//Constructor
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public abstract boolean asistencia();

	public String getNombre() {
		return nombre;
	}

	public char getSexo() {
		return sexo;
	}

}
