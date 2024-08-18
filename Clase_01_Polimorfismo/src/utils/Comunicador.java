package utils;

//---------- Clase abstracta Comunicador ---------- //
public abstract class Comunicador {

	// ---------- Métodos abstractos ---------- //
	public abstract void enviar(String msg);

	public abstract String recibir();

	// ---------- Métodos concretos ---------- //
	public int sumar(int a, int b) {
		return a + b;
	};

	public void saludar() {
		System.out.println("Hola");
	};
}
