package models;

public class FechaFestiva implements Comparable<FechaFestiva> {

	// ----- Atributos ----- //
	private int dia;
	private int mes;
	private String nombre;
	private double fanatismo;
	
	// ----- Constructor ----- //
	public FechaFestiva(int dia, int mes, String nombre, double fanatismo) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.nombre = nombre;
		this.fanatismo = fanatismo;
	}

	// ----- Getters y Setters ----- //

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getFanatismo() {
		return fanatismo;
	}

	public void setFanatismo(double fanatismo) {
		this.fanatismo = fanatismo;
	}
	
	// ----- Metodo toString() ----- //
	@Override
	public String toString() {
		return nombre + " {Dia: " + dia + ", Mes= " + mes + ", fanatismo= " + fanatismo + "}";
	}
	
	// ----- Metodo: Obtener el número total de días desde el inicio del año ----- //
	public int getDiasTotales() {
		return (this.mes - 1) * 30 + this.dia;
	}
	@Override
	public int compareTo(FechaFestiva otraFecha) {
		
		int resultado = 0;
		if (this.getDiasTotales() > otraFecha.getDiasTotales()) {
			resultado = 1;
		} else if (this.getDiasTotales() < otraFecha.getDiasTotales()) {
			resultado = -1;
		}
					
		return resultado;
	}

}
