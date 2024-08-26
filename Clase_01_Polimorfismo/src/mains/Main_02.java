package mains;

import utils.Comunicador;
import utils.ComunicadorArgentino;

public class Main_02 {

	public static void main(String[] args) {
		
		// ---- Creación de nuestro programa ----//

		//---- Creamos un nuevo objeto ----//
		
		// El objeto comunicador es del tipo de la clase abstracta
		// Pero a la hora de instanciarlo con el new lo hago con la clase hija
		Comunicador comunicador = new ComunicadorArgentino();

		//---- Utilizamos el metodo concreto ----//
		comunicador.saludar();
				
		System.out.println("¿De qué país sos?: ");

		//----Utilizamos el metodo abstracto recibir() y lo guardamos en una variable ----//
		String respuesta = comunicador.recibir();
		
		//---- Utilizamos el metodo abstracto enviar() y nos derá una respuesta ----//
		comunicador.enviar(respuesta);

	}

}
