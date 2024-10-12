package mains;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import models.BotellaDeAgua;

public class Main_01 {

	public static void main(String[] args) {

		// ---- Utlizamos la interfaz Supplier ---- //
		
		/*
		 * Vamos a utilizar el método estático getRandom, 
		 * para así no instanciar una clase de tipo BotellaDeAgua y utilizar dicho método.
		 * 
		 * Como getRandom es un método que no recibe nada y devuelve un objeto de tipo
		 * BotellaDeAgua, es ideal para utilizarlo con la Interfaz SUPPLIER
		 * 
		 * Vamos a utilizar tambien a usar la expresion LAMBDA para crear el generador de botellas de agua.
		 */
		
		Supplier<BotellaDeAgua> generador = () -> BotellaDeAgua.getRandom();
		
		// ---- Generamos 20 botellas de agua ----- //
		Stream.generate(generador)
		.limit(20) // limit: me estable un limite de elementos
		.forEach(b -> System.out.println(b)); // forEach: me recorre el conjunto de elementos y les doy una accion.
		
		/*
		 * Tambien podemos utilizar el metodo estatico EstaVacia. 
		 * Recibe un objeto de tipo BotellaDeAgua y devuelve un Booleano
		 * la interfaz que cumple con esa estructura es un Predicate. 
		 */
		
		Predicate<BotellaDeAgua> prediVacia = (b) -> BotellaDeAgua.estaVacia(b);
		
	}

}
