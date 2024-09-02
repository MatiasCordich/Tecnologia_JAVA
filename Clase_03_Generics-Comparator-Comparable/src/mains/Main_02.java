package mains;

import models.Perro;
import utils.AlternadorMagico;

public class Main_02 {

	public static void main(String[] args) {

		// ----- Creamos el objeto AlternadorMagico ----- //
		// Cuando se instancia, el primer valor sera el activo
		AlternadorMagico alternador = new AlternadorMagico();

		// Podemos setearle cualquier objeto de distintos tipos
		// ----- Le seteamos el primer valor de tipo Perro ----- //
		alternador.setPrimario(new Perro("Pepin", 10));

		// ----- Le seteamos el segundo valor el objeto alternador ----- //
		alternador.setSecundario(alternador);

		// ----- Hacemos un ruleta de alternador ----- //
		int numero = (int) (Math.random() * 10);

		for (int i = 0; i < numero; i++) {
			// Se va a alternar una cantidad random de veces
			alternador.alternar();
		}

		// ----- Obtengo el valor activo de alternador ----- //
		/* 
		 * Como se alterno una cantidad de veces random,
		 * hay un 50% de chances que sea Perro o AlternadorMagico.
		 * Aunque yo quiera hacer un casteo para que sea Perro, 
		 * hay un 50% que salga un objeto de tipo que no se pueda castear a Perro
		 *  */
		Perro p = (Perro) alternador.getActivo(); // Esto puede dar ClassCastException 

		System.out.println(p.getNombre());

	}

}
