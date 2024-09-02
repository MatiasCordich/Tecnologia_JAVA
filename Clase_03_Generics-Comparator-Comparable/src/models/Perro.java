package models;

public class Perro
implements Comparable<Perro>{

	// ------ Atributos ------ //
	private String nombre;
	private double pesoEnKg;
	
	// ------ Constructor ------ //
	public Perro(String nombre, double pesoEnKg) {
		super();
		this.nombre = nombre;
		this.pesoEnKg = pesoEnKg;
		
	// ------ Getters y Setters ------ //
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPesoEnKg() {
		return pesoEnKg;
	}
	public void setPesoEnKg(double pesoEnKg) {
		this.pesoEnKg = pesoEnKg;
	}
	
	// ------ toString() ------ //
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", pesoEnKg=" + pesoEnKg + "]";
	}
	
	// ------ Metodo compareTo() del Comparable implementado ------ //
	@Override
	public int compareTo(Perro otroPerro) {
		
		// Premisa
		int resultado = 0;
		
		// Comparacion logica
		if(this.getPesoEnKg() > otroPerro.getPesoEnKg()) {
			resultado = 1;
		}else  if(this.getPesoEnKg() < otroPerro.getPesoEnKg()) {
			resultado = -1;
		}
		
		// Devuelvo el resultado de la comparacion
		return resultado;
	}
	
	
}
