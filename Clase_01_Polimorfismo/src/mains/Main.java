package mains;

import utils.Comunicador;
import utils.ComunicadorPorConsola;

public class Main {

	public static void main(String[] args) {
		// ---------- Creación de nuestro programa ---------- //

		// ---------- Creamos un nuevo objeto ---------- //
		// El objeto comunicador es del tipo de la clase abstracta
		// Pero a la hora de instanciarlo con el new lo hago con la clase hija
		Comunicador comunicador = new ComunicadorPorConsola();

		// ---------- Utiliamos el metodo concreto ---------- //
		comunicador.saludar();

		// ---------- Utilizamos el metodo abstracto enviar() ---------- //
		comunicador.enviar("¿Como estas?");

		// ---------- Utiliamos el metodo abstracto recibir() y lo guardamos en una
		// variable ---------- //
		String respuesta = comunicador.recibir();

		// ---------- Establecemos una condicion ---------- //
		if (respuesta.length() > 15) {

			// Si la respuesta es muy larga, utilzamos el metodo abstracto enviar() y que
			// muestre un texto
			comunicador.enviar("ZZZzzzzzzzzz...");
		} else {

			// Caso contrario, utilzamos el metodo abstracto enviar() y que muestre un
			// mensaje de bienvenida con el respuesta
			comunicador.enviar("Me alegro que estes " + respuesta);
		}

	}

}
