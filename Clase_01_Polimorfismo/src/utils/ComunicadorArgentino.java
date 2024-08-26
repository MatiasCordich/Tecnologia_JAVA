package utils;

import java.util.Scanner;

public class ComunicadorArgentino extends Comunicador {

	// ---- Atributos propios de la clase ComunicadorArgentino ---- //
	private Scanner sc;

	// ---- Constructor de la clase ComunicadorArgentino ----- //
	public ComunicadorArgentino() {

		// Cuando instanciamos la clase nos crea también un nuevo Scanner
		this.sc = new Scanner(System.in);
	}

	// ---- Le damos implementaciones a los métodos abstractos heredados ---- //
	@Override
	public void enviar(String msg) {
		
		if(msg.equalsIgnoreCase("Argentina")) {
			// Si el mensaje es "Argentina" que me muestre un mensaje por consola
			System.out.println("SOY ARGENTINO, EL MEJOR PAIS DEL MUNDO LEJOS LEJOS LEJOS VAMO LOCOOOOOOOO");
			System.out.println("HAGAMO UN ASADO, TOMEMO FERNEE!!!!");
		} else {
			// Caso contrario que sea otro mensaje
			System.out.println("Bienvenido, me alegras que seas de: " + msg);
		}
	}

	@Override
	public String recibir() {
		// Recibo lo que escribo en el Scanner
		return this.sc.nextLine();
	}

}
