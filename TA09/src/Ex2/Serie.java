package Ex2;

public class Serie implements Entregable{

	private String titulo;
	
	private int temporadas;
	
	private boolean entregado;
	
	private String genero;
	
	private String creador;
	
	private final int TEMPORADAS_DEF = 3;
	
	private final boolean ENTREGADO_DEF = false;

	
	//creo el constructor con valores por defecto
	public Serie() {
		this.titulo = "";
		this.temporadas = TEMPORADAS_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero = "";
		this.creador="";
	}
	
	//declaro el constructor con valores título y creador definidos por el usuario, el resto serán los valores por defecto
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas = TEMPORADAS_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero = "";
		this.creador = creador;
	}

	//declaro el constructor con todos los valores definidos por el usuario
	public Serie(String titulo, int temporadas, boolean entregado, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}

	//GETTERS Y SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	//método toString
	public String toString() {
		return "Serie con título: " + titulo + ", nº de temporadas: " + temporadas + ", entregado: " + entregado + ", género: "
				+ genero + ", creador: " + creador;
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

	//comparo esta serie con otra que me llegará por parámetros, mostrando las temporadas de cada una
	public void compareTo(Object a) {
		Serie s = (Serie) a;
		System.out.println("La serie "+this.getTitulo()+" tiene "+this.getTemporadas()+" temporadas y la se rie "+s.getTitulo()+" tiene "+s.getTemporadas()+" temporadas");
	}

	
	
}
