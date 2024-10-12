package mains;

import java.util.Optional;
import java.util.function.Consumer;

import models.PalabrasContainer;

public class Main_02 {

	public static void main(String[] args) {

		// ----- Instanciamos la clase PalabrasContainer -----//
		PalabrasContainer cont = new PalabrasContainer();

		/*
		 * Usamos el metodo getPalabra(). Este metodo puede devolver "Hola" o null
		 */
		String palabra = cont.getPalabra();

		/*
		 * Vamos a instanciar un Optional y vamos a usar ofNullable() y le pasamos la
		 * variable palabra. Este metodo envuelve el valor que tenga "palabra" en un
		 * Optional. Si el valor es Null, el Optional estara vacio.
		 */

		Optional<String> optPa = Optional.ofNullable(palabra);

		/*
		 * Si el Optional de optPa contiene un valor, que lo transforme a mayusculas
		 * usando el toUpperCase() Si esta vacio que retorne NULL, usando el metodo
		 * orElse(null) del Optional.
		 */

		String pal = optPa
				.map(s -> s.toUpperCase()) // Si el optional tiene un valor que me lo devuelva en MAYUSCULAS
				.orElse(null); // Caso contrario que me devuelva NULL

		// Impresion del resultado
		System.out.println(pal);

		// --------------------------------------- //

		/*
		 * Usamos el metodo getPalabraOpt(). Este metodo va a devolver un Optional que
		 * puede tener un valor ("Hola") o nada.
		 */

		/*
		 * Al utilizar este metodo nos ahorramos el paso de envolver el valor de la
		 * variable en un Optional de esa manera podemos ir al ultmo paso que es
		 * utilizar los metodos
		 */
		String miPalabra = cont
				.getPalabraOpt()
				.map(s -> s.toUpperCase()) // Si el Optional tiene un valor que me lo devuelva en MAYUSCULAS				
				.orElse(""); // Caso contario que me devuelva un String vacio.

		// Impresion del resultaod
		System.out.println(miPalabra);

		// --------------------------------------- //

		/*
		 * Uso del metodo isPresentOrElse() del Optional. Verifica si un valor del
		 * Optional esta presente o no. Si existe, devuelve TRUE sino FALSE. Recibe por
		 * parametro una interfaz CONSUMER y una interfaz RUNNABLE
		 */

		// Creamos el consumer
		Consumer<String> mostrar = s -> System.out.println(s);

		// Creamos una excepcion con la interfaz funcional Runnable
		Runnable noEx = () -> System.out.println("No existe");

		/*
		 * Vamos a utilizar devuelta el metodo getPalabraOpt() nos puede devolver un
		 * Optional con una valo como no. El ifPresentOrElse() es un metodo del
		 * Optional. Recibe dos parametros> - Si el valor esta presente, utiliza el
		 * CONSUMER - Si el vanorno esta prsente, utiliza el RUNNABLE.
		 */

		cont
			.getPalabraOpt() // Usamos el metodo que devuelve un Optional de PalabrasContainer
			.ifPresentOrElse(mostrar, noEx); // Utilizo el ifPresentOrElse() para validar la existencia de un valor y ejecutar una accion en base al resultado. 
	}

}
