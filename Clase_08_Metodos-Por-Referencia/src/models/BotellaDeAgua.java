package models;

public class BotellaDeAgua {

	// ------ Metodos estaticos ----- //
	public static BotellaDeAgua getRandom() {
		double aleatorio = (Math.random() * 5);
		return new BotellaDeAgua((int)aleatorio);
	}
	public static BotellaDeAgua getVacia() {
		return new BotellaDeAgua(0);
	}
	public static int compararPorLitros(BotellaDeAgua b1, BotellaDeAgua b2) {
		return Double.compare(b1.litros, b2.litros);
	}

	public static boolean estaVacia(BotellaDeAgua b) {
		return b.litros == 0;
	}
	
	// ------ Atributos ----- //
	private double litros;
	
	// ------ Metodos estaticos ----- //
	public BotellaDeAgua(double litros) {
		super();
		this.litros = litros;
	}
	
	// ------ Getters y Setters ----- //
	public double getLitros() {
		return litros;
	}

	public double getPeso() {
		return litros + 0.1;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	// ------ Metodo toString ----- //
	@Override
	public String toString() {
		return "BotellaAgua [litros=" + litros + "]";
	}
}
