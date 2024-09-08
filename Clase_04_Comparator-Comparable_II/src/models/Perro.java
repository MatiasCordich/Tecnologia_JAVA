package models;

public class Perro
implements Comparable<Perro>{

	// ------ Atributos ------ //
	private String nombre;
	private String apellido;
	private double pesoEnKg;
	
	// ------ Constructor ------ //
	public Perro(String nombre, String apellido, double pesoEnKg) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.pesoEnKg = pesoEnKg;
	}

	// ------ Getters y Setters ------ //

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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
		return "Perro [nombre=" + nombre + ", apellido=" + apellido + ", pesoEnKg=" + pesoEnKg + "]";
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
