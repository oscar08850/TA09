package Ex2;

public class Videojuego implements Entregable {
	
	private String titulo;
	
	private int horas;
	
	private boolean entregado;
	
	private String genero;
	
	private String compañia;
	
	private final int HORAS_DEF = 10;
	
	private final boolean ENTREGADO_DEF = false;

	//defino el constructor con todos los datos por defecto
	public Videojuego() {
		this.titulo = "";
		this.horas = HORAS_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero = "";
		this.compañia = "";
	}
	
	//defino el constructor con el título y horas definidas por el usuario, el resto de datos por defecto
	public Videojuego(String titulo, int horas) {
		this.titulo = titulo;
		this.horas = horas;
		this.entregado = ENTREGADO_DEF;
		this.genero = "";
		this.compañia = "";
	}

	//defino el constructor con todos los datos definidos por el usuario
	public Videojuego(String titulo, int horas, boolean entregado, String genero, String compañia) {
		super();
		this.titulo = titulo;
		this.horas = horas;
		this.entregado = entregado;
		this.genero = genero;
		this.compañia = compañia;
	}

	//GETTERS Y SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	//método toString
	public String toString() {
		return "Videojuego con título: " + titulo + ", horas estimadas de juego: " + horas + ", entregado: " + entregado + ", genero=" + genero
				+ ", compañia=" + compañia + "]";
	}

	//cambio el estado de entregado a true
	public void entregar() {
		this.entregado = true;
	}

	//cambio el estado de entregado a false
	public void devolver() {
		this.entregado = false;
	}

	//compruebo si ha sido entregado, devolviendo true si es así y de lo contrario devuelvo false
	public boolean isEntregado() {
		if(this.entregado) {
			return true;
		}else {
			return false;
		}
	}

	//comparo este videojuego con otro que me llegará por parámetros, mostrando las horas estimadas de juego de cada uno
	public void compareTo(Object a) {
		Videojuego v = (Videojuego) a;
		System.out.println("El videojuego "+this.getTitulo()+" tiene "+this.getHoras()+" horas estimadas de juego y el videojuego "+v.getTitulo()+" tiene "+v.getHoras()+" horas estimadas de juego");
	}
	
	
	

}
