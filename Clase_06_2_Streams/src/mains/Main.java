package mains;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		// ----- Lista de nombres (Inmutable) -----//
		List<String> nombres = List.of("Pepe", "Mariela", "Gabriel", "Marcos", "Juan", "Sofia", "Noelia");
		
		// ----- Lista de nombres (Mutable) -----//
		List<String> listaNombres = new ArrayList<String>(nombres);

		// ----- Clase anónima usando la Interfaz Predicate -----//
		Predicate<String> empiezaM = s -> s.startsWith("M");
		
		// ----- Usamos el removeIf pasandole el predicado que creamos -----//
		// Todos los nombre que empiezan con M seran removidos
		listaNombres.removeIf(empiezaM);
		
		System.out.println(listaNombres);

		// ----- Uso del stream, filtramos con el Predicate -----//
		// Nos devuelve una lista filtrada con solo los nombres que empiezan con M
		List<String> filtrada = nombres.stream().filter(empiezaM).toList();

		System.out.println(nombres);
		System.out.println(filtrada);

		// ----- Clase anónima usando la Interfaz Consumer (mostrar el string) -----//
		Consumer<String> mostrar = (s) -> System.out.println(s);

		// ----- Clase anónima usando la Interfaz Comparator (comparamos por valor) -----//
		Comparator<String> alfa = (s1, s2) -> s1.compareToIgnoreCase(s2);

		// ----- Clase anónima usando la Interfaz Function (Ingresa un string y devuelve un string en mayuscula) -----//
		Function<String, String> mayus = (s) -> s.toUpperCase();

		// Aplicamos todas las clases anonimas para filtrar la lista y mostrarla
		nombres.stream().sorted(alfa).map(mayus).forEach(mostrar);

	}

}
