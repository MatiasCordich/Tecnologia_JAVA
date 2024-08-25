package models;

import interfaces.Pesable;

public class BotellaDeAgua implements Pesable {

	// ---------- Atributos de la clase BotellaDeAgua ----------
	private double cantLitros;
	
	// ---------- Constructor de la clase BotellaDeAgua ----------
	public BotellaDeAgua(double cantLitros) {
		super();
		this.cantLitros = cantLitros;
	}

	// ---------- Getters ----------
	public double getCantLitros() {
		return cantLitros;
	}

	// ---------- Setters ----------
	public void setCantLitros(double cantLitros) {
		this.cantLitros = cantLitros;
	}

	@Override
	public double getPesoEnGr() {
		return this.cantLitros * 1000 + 20;
	}

	 

	
	
}
