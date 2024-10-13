package mains;


import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

import containers.PalabrasContainer;
import models.BotellaDeAgua;

public class Main_02 {

	public static void main(String[] args) {

		// ------------------- OBJETO DEFINIDO ------------------- //
		
		// ----- Instanciamos la clase BotellaDeAgua -----//
		BotellaDeAgua botellin = new BotellaDeAgua(2);
		
		
		/*
		 * En este ejemplo vamos a pasar por referencia el método getPeso() de un OBJETO DEFINIDO.
		 * 
		 * -> botellin es un OBJETO DEFINIDO ya que es la instancia de la clase BotellaDeAgua
		 * -> Como es un OBJETO DEFINIDO, el 'this' no varia.
		 * -> Como botellin es un OBJETO DEFINIDO el metodo getPeso() le pertenece directamente.
		 * 
		 * Para hacer el pasaje del metodo por referencia necesito saber tres cosas: 
		 * - ¿Qué recibe el método getPeso? No recibe nada 
		 * - ¿Qué devuelve? Devuelve un Doube Una vez que sabemos eso nos preguntamos 
		 * - ¿Existe una interfaz funcional cuyo método no recibe nada y devuelve un valor de tipo? Sí, la interfaz Supplier.
		 * 
		 *¿Porqué el Supplier?
		 * Utilizamos el Supplier porque como el objeto YA ESTA DEFINIDO, no hace falta pasarle nada por parametro al método getPeso()
		 * Y como no recibe nada por parametro y devuelve un Double, entonces la unica interfaz posible es el Supplier
		 */
		
		// Creamos un Supplier que apunte (referencie) al método getPeso() de la instancia botellin
		Supplier<Double> bgp = botellin::getPeso;
		
		// Usamos le método del Supplier para obtener el peso
        double pesoBotella = bgp.get();

        // Imprimir el resultado
        System.out.println("El peso de la botella es: " + pesoBotella + " kg");

        // ------------------- OBJETO INDEFINIDO ------------------- //
		/*
		 * Ahora vamos a hacer exactamente lo mismo, vamos a pasar por referencia el metodo getPeso() pero mediante un OBJETO INDEFINIDO. 
		 * 
		 * -> En este caso no estamos haciendo referencia a ninguna instancia de la clase BotellaDeAgua, es decir, no definimos ningún objeto de tipo BotellaDeAgua
		 * -> Como no referenciamos a la instancia, vamos a referenciar al método getPeso() de la CLASE BotellaDeAgua
		 * -> Cuando el objeto es INDEFINIDO, al metodo que vamos a referenciar (getPeso) se le va a pasar de forma dinamica el "this" por paramétro, que en esta caso sera BotellaDeAgua.
		 * 
		 * Entonces el método getPeso() para este caso será de la forma siguiente 
		 * -> Va a recibir de forma dinámica BotellaDeAgua
		 * -> Va a devolver un Double
		 * 
		 * Ahora que sabemos esto, hacemos las 3 preguntas bajo estas condiciones:
		 * - ¿Qué recibe el método getPeso? En esta caso va a recibir 'this' que es BotellaDeAgua 
		 * - ¿Qué devuelve? Devuelve un Doube
		 * - ¿Existe una interfaz funcional cuyo método reciba un objeto de tipo T y devuelve otro objeto de tipo R? Sí, la interfaz Fucntion.
		 * 
		 *¿Porqué el Function?
		 * Utilizamos Function porque como el objeto ES INDEFINIDO, le pasamos por paramétro de forma dinámica el 'this' que sera BotellaDeAgua en getPeso()
		 * Entonces como recibe BotellaDeAgua y devuelve un Double, entonces la unica interfaz posible es el Function
		 * 
		 */
        
        Function<BotellaDeAgua,Double> ge = BotellaDeAgua::getPeso;
        
        // ----------- Programacion funcional ----------- //
        List<BotellaDeAgua> botellas = Stream
        		.generate(BotellaDeAgua::getRandom) // Vemos que el metodo getRandom esta en cursiva, nos indica que es un metodo estático.
        		.limit(5)
        		.toList();
        
        botellas
        	.stream()
        	.map(BotellaDeAgua::getLitros) // Si el metodo no esta en cursiva, NO es estático 
        	.forEach(System.out::println);
        
        // 
        
        
        

	}

}
