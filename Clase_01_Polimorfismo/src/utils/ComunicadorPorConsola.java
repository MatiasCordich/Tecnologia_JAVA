package utils;

import java.util.Scanner;

public class ComunicadorPorConsola extends Comunicador {

	// ---- Atributos propios de la clase ComunicadorPorConsola ---- //
	private Scanner sc;

	// ---- Constructor de la clase ComunicadorPorConsola ---- //
	public ComunicadorPorConsola() {

		// Cuando instanciamos la clase nos crea también un nuevo Scanner
		this.sc = new Scanner(System.in);
	}

	// ---- Le damos implementaciones a los métodos abstractos heredados ---- //
	@Override
	public void enviar(String msg) {
		// La implementación será que se imprima por pantalla el mensaje que recibe
		System.out.println(msg);
	}

	@Override
	public String recibir() {
		// La implementación será que devuelva lo que se escribió en el Scanner
		return this.sc.next();
	}

}
