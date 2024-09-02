package mains;

import utils.Alternador;
import utils.Comunicador;
import utils.ComunicadorMayus;
import utils.ComunicadorMinus;

public class Main_03 {

	public static void main(String[] args) {
		
		// ----- Creamos el objeto Alternador ----- //
		/* 
		 * Al usar un Generic le establecemos el tipo de dato que va a usar,
		 * en nuestro caso solo va a trabajar con objetos de tipo Comunicador.
		 *  */
		Alternador<Comunicador> alter = new Alternador<Comunicador>();

		// ----- Le seteamos el primer valor (es de tipo Comunicador) ----- //
		alter.setPrimario(new ComunicadorMayus());
		
		// ----- Le seteamos el segundo valor (es de tipo Comunicador) ----- //
		alter.setSecundario(new ComunicadorMinus());
		
		// ----- Hacemos una prueba para ver la efectividad de los generics ----- //
		while(true) {
			
			// Obtiene el valor activo de alter y usamos el metodo enviar()
			alter.getActivo().enviar("Hola");
			
			// Del valor activo utilizamos el metodo recibir() y lo guardamos en un String
			String op = alter.getActivo().recibir();
			
			// Evaluamos el valor de la variable "op"
			if(op.equals("1")) {
				// Si es 1, entonces que me de el valor activo y me envie "Que tal?"
				alter.getActivo().enviar("Que tal?");
			}else if(op.equals("2")) {
				// Si es 2, entonces que me alterne al otro valor
				alter.alternar();
			}else {
				// Si no es ninguna que me muestre un mensaje de error
				alter.getActivo().enviar("Opcion invalida");
			}
				
		}
		
		/* 
		 * Como vemos, da igual que valor se alterne,
		 * como en nuestro Generic ya definimos que se van a trabajar con datos de tipo Comunicador, 
		 * la consistencia del progrma no se va a romper porque todos los objetos son del mismo tipo de dato.
		 * De esta manera no se rompe con los tipos de datos y no hacemos casteos innecesarios
		 *  */
		

	}

}
