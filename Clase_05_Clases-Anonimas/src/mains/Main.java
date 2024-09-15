package mains;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		// Creamos una lista (original) y le agregamos elementos con el List.of()
		List<String> palabras1 = List.of("Hola", "Jajaja", "Chicho", "Ay", "Cocodrilo", "Huevo Acuña", "Messi");

		// Creamos una lista modificable
		List<String> palabras = new ArrayList<String>(palabras1);

		// ---------------------------- COMPARATOR ----------------------------//
		
		// Creamos un Comparator que nos compare por cantidad de letras
		Comparator<String> cantLetras = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		};
		
		// Vamos a ordenar la lista por cantidad de letras
		palabras.sort(cantLetras);

		System.out.println("---------- Comparator: Cantidad Letras ----------");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}

		// ---------------------------- COMPARATOR INVERTIDO ----------------------------//
		// Creamos un comparador pero que su orden este invertido
		Comparator<String> cantLetrasInvertido_1 = cantLetras.reversed();

		// Vamos a usar en nuevo criterio
		palabras.sort(cantLetrasInvertido_1);

		System.out.println("---------- Comparator: Cantidad Letras INVERTIDO ----------");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}

		// ---------------------------- COMPARATOR CLASE ANONIMA  ----------------------------//
		
		// El código de la clase anónima generada sería equivalente a algo como esto
		Comparator<String> cantLetrasInvertido_2 = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o1.length() - o2.length()) * -1;
			}
		};

		// Vamos a usar en nuevo criterio
		palabras.sort(cantLetrasInvertido_2);

		System.out.println("---------- Comparator: Cantidad Letras INVERTIDO CLASE ANONIMA ----------");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}

		// ---------------------------- FUNCTION ----------------------------//
		
		// Creamos la clase anonima con la interfaz Function
		Function<String, Integer> cuantasLetras = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				// Me devuelve la cantidad de letras que tiene el String
				return t.length();
			}
		};

		// Utilizamos la interfaz
		System.out.println("---------- Function: Cantidad de palabras ----------");
		for (String palabra : palabras) {
			System.out.println(palabra + ". Cantidad de letras: " + cuantasLetras.apply(palabra) );
		}
		
		// ---------------------------- CONSUMER  ----------------------------//
		
		// Creamos la clase anonima con la interfaz Consumer
		Consumer<String> mostrar = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("Palabra: " + t);
			}
		};
		
		System.out.println("---------- Consumer: Mostar palabras ----------");
		// Utilizamos la interfaz
		palabras.forEach(mostrar);

		// ---------------------------- PREDICATE ----------------------------//
		
		// Creamos la clase anonima con la interfaz Predicate
		Predicate<String> prediMayor4 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// La condicion es evaluar si la longitud del string es mayor a 4
				return t.length() > 4;
			}
		};

		// Utilizamos la interfaz en un metodo llamado removeIf()
		palabras.removeIf(prediMayor4);

		System.out.println("---------- Predicate: Mayor a 4 letras ----------");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}

	}

}
