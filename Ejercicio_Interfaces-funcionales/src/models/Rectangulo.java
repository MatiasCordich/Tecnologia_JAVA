package models;

public class Rectangulo {

	// ----------- ATRIBUTOS ----------- //
	private double base;
	private double altura;

	// ----------- CONSTRUCTOR ----------- //
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	// ----------- GETTERS Y SETTERS ----------- //
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
