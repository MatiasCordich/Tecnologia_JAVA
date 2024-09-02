package utils;

public class AlternadorMagico {
	
	/* 
	 * Como vemos, reemplazamos todos los tipos String por Object. 
	 * Esto implica que acepta CUALQUIER OBJETO
	 * Esto puede traer complicaciones a la hora de hacer un programa.
	 *  */
	
	// -------- ATRIBUTOS --------//
	private Object primario;
	private Object secundario;
	private boolean usarPrimario;

	// -------- CONSTRUCTOR --------//
	public AlternadorMagico() {
		this.usarPrimario = true;
	}

	// -------- METODOS --------//
	public Object getActivo() {
		return usarPrimario ? primario : secundario;
	}

	public void alternar() {
		this.usarPrimario = !this.usarPrimario;
	}

	// -------- GETTERS Y SETTERS --------//
	public Object getPrimario() {
		return primario;
	}

	public void setPrimario(Object primario) {
		this.primario = primario;
	}

	public Object getSecundario() {
		return secundario;
	}

	public void setSecundario(Object secundario) {
		this.secundario = secundario;
	}
}
