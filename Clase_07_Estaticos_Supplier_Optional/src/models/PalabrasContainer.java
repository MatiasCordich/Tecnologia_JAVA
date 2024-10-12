package models;

import java.util.Optional;

public class PalabrasContainer {

	// ----- Metodos de la clase PalabrasContainer -----//

	/**
	 * Obtiene una palabra en base a un numero random.
	 * 
	 * @return Devuelve "Hola" si el numero random obtenido es mayor a 0.5
	 * @retrun Devuelve null si el numero random obtenido es menor a 0.5
	 */

	public String getPalabra() {
		double num = Math.random();
		if (num > 0.5) {
			return "Hola";
		}
		return null;

	}

	/**
	 * Obtiene una palabra en base a un numero random pero se utiliza la clase
	 * Optional para brindar mas seguridad y evitar la excepcion de valores nulos
	 * 
	 * @return Devuelve "Hola" si el numero random obtenido es mayor a 0.5
	 * @retrun Devuelve null si el numero random obtenido es menor a 0.5
	 */

	public Optional<String> getPalabraOpt() {

		double num = Math.random();

		if (num > 0.5) {

			// Uso del metodo of() para crear el Optional
			// Le paso por parametro el valor.
			return Optional.of("Hola");
		}

		// Uso del metodo empty() para crear el Optional
		// Al utilizar este metodo decimos que el Optional es vacio
		return Optional.empty();
	}

}
