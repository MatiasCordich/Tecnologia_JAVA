package interfaces;

public interface Comunicador {
	
	// ------ Metodos abstractos de la interfaz Comunicador ------ //
	public void enviar(String msj);

	public String recibir();

	public default int sumar(int a, int b) {
		return a + b;
	}

	public default void saludar() {
		this.enviar("Hola");
	}
}
