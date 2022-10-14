package Ex1;

public class Television extends Electrodomestico {
	// atributos
	private int resolucion;
	private boolean sintonizadorTDT;
	private final int RESOLUCION = 20;
	private final boolean SINTONIZADOR_TDT = false;

	// constructor por defecto
	public Television() {
		super();
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADOR_TDT;
	}

	// constructor
	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADOR_TDT;
	}

	// constructor
	public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolucion,
			boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	// Getters
	
	

	public int getResolucion() {
		return resolucion;
	}

	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}

	// Si el televisor es mayor de 40 pulgadas el precio sube un 30%, y si tiene
	// sintonizador sube 50€ más.
	// Interpretamos que el 30% de subida de precio se hace sin contar los 50€ del sintonizador por como se explica en el enunciado.
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		if (resolucion > 40) {
			precioFinal = (precioFinal + (precioFinal * 30) / 100);
		}
		if (sintonizadorTDT) {
			precioFinal = precioFinal + 50;
		}
		return precioFinal;
	}
}
