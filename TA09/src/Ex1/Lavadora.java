package Ex1;

public class Lavadora extends Electrodomestico {

	private int carga;
	private final int CARGA = 5;

	/// constructor ///
	public Lavadora() {
		super();
		this.carga = CARGA;
	}

	// constructor
	public Lavadora(int precio, int peso) {
		super(precio, peso);
		this.carga = CARGA;
	}
	
	public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = CARGA;
	}
	
	public int getCarga() {
		return carga;
	}
	

	public double precioFinal() {
		double precioFinal = super.precioFinal();
		
		if(getCarga()>30) {
			precioFinal = precioFinal + 50;
		}
		
		return precioFinal;
	}
	
}
