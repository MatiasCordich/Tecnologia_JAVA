package mains;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import containers.PalabrasContainer;

public class Main_01 {

	public static void main(String[] args) {

		// ----- Metodos de referencia con OBJETO DEFINIDO ----- //

		// Con "::" hacemos referencia el método sin ejectuarlo
		// Con "." ejecutamos de forma directa el método

		// ----- EJEMPLO SCANNER ----- //

		// Creamos un objeto de tipo Scanner, estamos DEFINIENDO UN OBJETO
		Scanner sc = new Scanner(System.in);

		/*
		 * Vamos a crear una lista usando un Stream generado mediante lo que ingresemos
		 * por consola. - El metodo sc::next hace referencia al método del OBJETO QUE
		 * DEFINIDMOS anteriormente "sc". - Aplicamos map() para convertir el objeto
		 * recibido por teclado a String (aunque es innecesario) - El filter() se
		 * asegura que solo pasen las palabras que empiecen con "S" - Le damos un límite
		 * de 3 elementos a la lista. Por ultimo convertimos el Stream en una lista con
		 * el toList()
		 */

		List<String> pepe = Stream
				.generate(sc::next)
				.map(s -> s.toString())
				.filter(s -> s.startsWith("S"))
				.limit(3)
				.toList(); // Importante el orden de las operaciones en la pipeline de Stream.

		// Se transforma la lista inmutable retornada por Stream en una lista mutable de
		// tipo ArrayList.
		pepe = new ArrayList<String>(pepe);
		System.out.println(" --------- Pepe Inicial ---------");
		System.out.println(pepe);

		/*
		 * Veamos algo particular. El metodo generate() recibe un Supplier El metodo
		 * map() recibe un Function El metodo filter() recibe un Predicate
		 */

		Supplier<String> scSupplier = sc::next;
		Function<String, String> scFunction = s -> s.toString();
		Predicate<String> scPredicate = s -> s.startsWith("S");

		List<String> pepeInterfaces = Stream
				.generate(scSupplier)
				.map(scFunction)
				.filter(scPredicate)
				.limit(3)
				.toList();

		pepeInterfaces = new ArrayList<String>(pepeInterfaces);
		System.out.println(" --------- Pepe Interfaces ---------");
		System.out.println(pepeInterfaces);

		// ----- Metodos de referencia con OBJETO DEFINIDO (Listas) ----- //

		// Creamos dos nuevas listas
		List<String> pepe1 = new ArrayList<String>();
		List<String> jorge = new ArrayList<String>();

		// Sabemos que las listas tienen un metodo llamado add().
		// Vamos a usar la lista pepe1 para referenciar el metodo add()

		/*
		 * Ahora bien las preguntas son: ¿Qué recibe en este caso el método add()?
		 * Recibe un String ¿Qué devuevle? No devuelve nada ¿Existe una interfaz
		 * funcional que RECIBA algo y no devuelva NADA? Sí, el Consumer.
		 */
		
		Consumer<String> pAdd = pepe1::add;
		
		/*
		 * También puedo escribir la referencia en expresión lambda
		 * De esta manera tenemos un equivalente a pepe1::add
		 */
		
		Consumer<String> pAddL = s -> pepe1.add(s);
		
		// Comparacion entre el uso de :: o expresion lambda para la lista 'jorge'
		Consumer<String> jAdd = jorge::add;
		Consumer<String> jAddL = s -> jorge.add(s);
		
		// ----- Metodos de referencia y uso de los Optional ----- //
		
		// Instanciamos el contenedor de PalabrasContainer
		PalabrasContainer cont = new PalabrasContainer();
		
		// Vamos a agregar una palabra a la lista de 'jorge'
		cont
		.getPalabraOpt() // Me puede devolver tanto un string como nada
		.ifPresent(jAddL); // Mediante el ifPresent() evaluamos si existe el valor, si existe le pasamos el consumer que referencia el metodo add()
		
		// Lo mismo pero con la lista de 'pepe1'
		cont
		.getPalabraOpt()
		.ifPresent(pAdd); // Podemos usar tanto el Consumer simplificado como el escrito en expresion lambda
		
		/*
		 * Recordemos que creamos un Consumer por lo que podemos ejecutar su funcion que es accept()
		 * Al utilizarla, estamos a su vez usando el metod add() que pasamos por referencia
		 * */
		
		jAdd.accept("ANKARA MESSI");
		
		System.out.println("----- Jorge -----");
		System.out.println(jorge);
		
		// ----- Usar metodos por referencia en estrucutar de Java ----- //
		
		/*
		 * El println() que siempre usamos es un metodo de Java que sale 
		 * del OUT que a su vez sale de la clase System. 
		 * El OUT es un objeto de tipo PrintStream que maneja la salida.
		 * Por lo que podemos referenciar el metodo println() de la siguiente manera. 
		 * */
		
		// Definimos la variable de tipo PrintStream
		PrintStream salida = System.out;
		
		// Vamos a imprimir cada elemento de 'jorge' usando el println() por referencia
		System.out.println("----- Jorge -----");
		jorge.forEach(salida::println);
		
		// EL println() es un metodo que recibe un Objeto pero no devuelve nada, podriamos hacer un Consumer
		Consumer<String> print = salida::println;
		
		// Vamos a usar este consumer en la lista pepe
		System.out.println("----- Pepe -----");
		pepe.forEach(print);
		
		// Tambien se puede usar la expresion lambda
		Consumer<String> printL = (s) -> salida.println(s);
		
		System.out.println("----- Pepe1 -----");
		pepe1.forEach(printL);
		
		
		

	}

}
