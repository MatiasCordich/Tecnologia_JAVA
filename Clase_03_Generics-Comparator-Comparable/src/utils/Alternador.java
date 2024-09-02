package utils;

// A la clase Alternador le agrego un Generic
public class Alternador<T> {
	
	// Como vemos los tipos de datos tanto en los metodos como atributos se adaptan al Generic 
	
	// -------- ATRIBUTOS --------//
	private T primario;
	private T secundario;
	private boolean usarPrimario;

	// -------- CONSTRUCTOR --------//
	public Alternador() {
		this.usarPrimario = true;
	}

	// -------- METODOS --------//
	public T getActivo() {
		return usarPrimario ? primario : secundario;
	}

	public void alternar() {
		this.usarPrimario = !this.usarPrimario;
	}

	// -------- GETTERS Y SETTERS --------//
	public T getPrimario() {
		return primario;
	}

	public void setPrimario(T primario) {
		this.primario = primario;
	}

	public T getSecundario() {
		return secundario;
	}

	public void setSecundario(T secundario) {
		this.secundario = secundario;
	}
}
