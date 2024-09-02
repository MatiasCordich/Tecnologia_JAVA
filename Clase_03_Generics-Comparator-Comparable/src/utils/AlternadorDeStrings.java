package utils;

public class AlternadorDeStrings {
	
	// -------- ATRIBUTOS --------//
	private String primario;
	private String secundario;
	private boolean usarPrimario;

	// -------- CONSTRUCTOR --------//
	public AlternadorDeStrings() {
		this.usarPrimario = true;
	}

	// -------- METODOS --------//
	public String getActivo() {
		return usarPrimario ? primario : secundario;
	}

	public void alternar() {
		this.usarPrimario = !this.usarPrimario;
	}

	// -------- GETTERS Y SETTERS --------//
	public String getPrimario() {
		return primario;
	}

	public void setPrimario(String primario) {
		this.primario = primario;
	}

	public String getSecundario() {
		return secundario;
	}

	public void setSecundario(String secundario) {
		this.secundario = secundario;
	}
}
