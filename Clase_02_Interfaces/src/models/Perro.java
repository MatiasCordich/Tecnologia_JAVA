package models;

import interfaces.Pesable;

public class Perro implements Pesable {

	// ---------- Propiedades de la clase Perro ----------
	private String nombre;
	private double pesoEnKg;
	
	// ---------- Constructor de la clase Perro ----------
	public Perro(String nombre, double peso) {
		super();
		this.nombre = nombre;
		this.pesoEnKg = peso;
	}


	// ---------- Getters ----------
	public String getNombre() {
		return nombre;
	}
	
	public double getPeso() {
		return pesoEnKg;
	}

	// ---------- Setters ----------
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPeso(double peso) {
		this.pesoEnKg = peso;
	}

	// ---------- Implementación del método abstracto de la interfaz Pesable ----------
	@Override
	public double getPesoEnGr() {
		return this.pesoEnKg * 1000;
	}

	

}
