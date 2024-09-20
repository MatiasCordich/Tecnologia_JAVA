package mains;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import models.Persona;
import models.Rectangulo;

public class Main_01 {

	public static void main(String[] args) {

		// ---------- Objetos de prueba ----------//
		Persona persona_1 = new Persona("Carlitos", 23, 67, 1.78);
		Persona persona_2 = new Persona("Jorge", 45, 89, 1.88);

		Rectangulo rectangulo_1 = new Rectangulo(12.4, 23.5);
		Rectangulo rectangulo_2 = new Rectangulo(10.0, 15.0);

		// ---------- Comparator <T> ----------//
		// 1. Crear un comparador que compare dos personas por altura.
		System.out.println(" --------- COMPARADOR POR ALTURA --------- ");
		Comparator<Persona> comparadorPorAltura = new Comparator<Persona>() {

			@Override
			public int compare(Persona per_1, Persona per_2) {
				return Double.compare(per_1.getEstatura(), per_2.getEstatura());
			}
		};
		System.out.println(comparadorPorAltura.compare(persona_1, persona_2));

		// 2. Crear un comparador que compare personas por edad.
		System.out.println(" --------- COMPARADOR POR EDAD --------- ");
		Comparator<Persona> comparadorPorEdad = new Comparator<Persona>() {

			@Override
			public int compare(Persona per_1, Persona per_2) {
				return Integer.compare(per_1.getEdad(), per_2.getEdad());
			}
		};
		
		System.out.println(comparadorPorEdad.compare(persona_1, persona_2));
		
		// 3. Crear un comparador que compare personas por edad y si son iguales por
		// estatura.
		System.out.println(" --------- COMPARADOR POR EDAD Y ESTATURA --------- ");
		Comparator<Persona> comparadorPorEdadYEstatura = new Comparator<Persona>() {

			@Override
			public int compare(Persona per_1, Persona per_2) {
				
				int resultado = Integer.compare(per_1.getEdad(), per_2.getEdad());

				if (resultado == 0) {
					return Double.compare(per_1.getEstatura(), per_2.getEstatura());
				}

				return resultado;

			}
		};
		
		System.out.println(comparadorPorEdadYEstatura.compare(persona_1, persona_2));
		
		System.out.println(" --------- COMPARADOR POR PESO INVERTIDO --------- ");
		// 4. Crear un comparador que compare personas por peso inversamente.
		Comparator<Persona> comparadorPorPesoInvertido = new Comparator<Persona>() {

			@Override
			public int compare(Persona per_1, Persona per_2) {
				return Double.compare(per_2.getPeso(), per_1.getPeso());
			}
		};
		
		System.out.println(comparadorPorPesoInvertido.compare(persona_1, persona_2));
		
		System.out.println(" --------- COMPARADOR POR BASE --------- ");
		// 5. Crear un comparador que compare la base de dos rectángulos.
		Comparator<Rectangulo> comparadorPorBase = new Comparator<Rectangulo>() {

			@Override
			public int compare(Rectangulo r1, Rectangulo r2) {
				return Double.compare(r1.getBase(), r2.getBase());
			}
		};
		
		System.out.println(comparadorPorBase.compare(rectangulo_1, rectangulo_2));

		// ---------- Function <T , R> ----------//
		
		System.out.println(" --------- FUNCTION RETORNAR AREA --------- ");
		// 1. Crear un función que reciba un rectángulo y retorne su área
		Function<Rectangulo, Double> retornarAreaRectangulo = new Function<Rectangulo, Double>() {

			@Override
			public Double apply(Rectangulo r) {
				double areaRectangulo = r.getBase() * r.getAltura();
				return areaRectangulo;
			}
		};
		
		System.out.println(retornarAreaRectangulo.apply(rectangulo_1));
		
		System.out.println(" --------- FUNCTION RETORNAR PERIMETRO --------- ");
		// 2. Crear una función que reciba un rectángulo y retorne su perímetro
		Function<Rectangulo, Double> retornarPerimetroRectangulo = new Function<Rectangulo, Double>() {

			@Override
			public Double apply(Rectangulo r) {
				double perimetroRectangulo = (r.getBase() + r.getAltura()) * 2;
				return perimetroRectangulo;
			}
		};
		
		System.out.println(retornarPerimetroRectangulo.apply(rectangulo_2));
		
		System.out.println(" --------- FUNCTION RETORNAR TRIPLE --------- ");
		// 3. Crear un función que reciba un double y retorne el triple de dicho numero
		Function<Double, Double> retornarTripleNumero = new Function<Double, Double>() {

			@Override
			public Double apply(Double num) {
				double tripleNumero = num * 3;
				return tripleNumero;
			}
		};
		
		System.out.println(retornarTripleNumero.apply(6.8));
		
		System.out.println(" --------- FUNCTION RETORNAR TRIPLE AREA --------- ");
		// 4. Crear una función que retorne el triple del área de un rectángulo
		Function<Rectangulo, Double> retornarTripleAreaRectangulo = new Function<Rectangulo, Double>() {

			@Override
			public Double apply(Rectangulo r) {
				double tripleAreaRectangulo = (r.getBase() * r.getAltura()) * 3;
				return tripleAreaRectangulo;
			}
		};
		
		System.out.println(retornarTripleAreaRectangulo.apply(rectangulo_1));
		
		System.out.println(" --------- FUNCTION RETORNAR RECTANGULO PERSONIFICADO --------- ");
		/*
		 * 5. Crear una función que reciba una persona y retorne un rectángulo cuya
		 * altura es la estatura de la persona y su base el peso.
		 */
		Function<Persona, Rectangulo> personaRectangulizada = new Function<Persona, Rectangulo>() {

			@Override
			public Rectangulo apply(Persona p) {
				double altura = p.getEstatura();
				double base = p.getPeso();
				Rectangulo personaRectangulizada = new Rectangulo(base, altura);
				return personaRectangulizada;
			}
		};
		
		Rectangulo rectanguloPersonificado = personaRectangulizada.apply(persona_2);
		System.out.println("Altura: " + rectanguloPersonificado.getAltura() + " Base: " + rectanguloPersonificado.getBase());
		
		System.out.println(" --------- FUNCTION RETORNAR TRIPLE AREA PERSONA RECTANGULIZADA --------- ");
		/*
		 * 6. Realizar una función que retorne el triple del área de una persona como si
		 * la misma fuera un rectángulo (Siendo peso la base y estatura la altura)
		 */
		Function<Persona, Double> obtenerTripleAreaPersona = new Function<Persona, Double>() {
			@Override
			public Double apply(Persona p) {
				// Convertir la persona en un rectángulo
				Rectangulo rectangulo = personaRectangulizada.apply(p);
				// Calcular el área del rectángulo
				Double area = retornarAreaRectangulo.apply(rectangulo);
				// Retornar el triple del área
				return retornarTripleAreaRectangulo.apply(rectangulo);
			}
		};
		
		System.out.println(obtenerTripleAreaPersona.apply(persona_1));
		
		// ---------- Predicate <T> ----------//
		
		System.out.println(" --------- PREDICATE PERSONA MIDE MAS 2 METROS --------- ");
		// 1. Crear un predicado que evalúe si una persona mide más de dos metros
		Predicate<Persona> personaMasDosMetros = new Predicate<Persona>() {

			@Override
			public boolean test(Persona p) {
				return p.getEstatura() > 2.00;
			}
		};
		
		if(personaMasDosMetros.test(persona_1)) {
			System.out.println("Mide mas de 2 metros");
		} else {
			System.out.println("No mide mas de 2 metros");
		}
		
		System.out.println(" --------- PREDICATE PERSONA NO MIDE MAS 2 METROS --------- ");
		// 2. Crear un predicado que evalúe si la persona no mide más de dos metros
		Predicate<Persona> personaNoMideDosMetros = new Predicate<Persona>() {

			@Override
			public boolean test(Persona p) {
				return p.getEstatura() < 2.00;
			}
		};
		
		if(personaNoMideDosMetros.test(persona_2)) {
			System.out.println("No mide mas de 2 metros");
		} else {
			System.out.println("Mide mas de 2 metros");
		}
		
		System.out.println(" --------- PREDICATE PERSONA MAYOR DE EDAD --------- ");
		// 3. Crear un predicado que evalúe si es mayor de edad
		Predicate<Persona> personaMayorDeEdad = new Predicate<Persona>() {

			@Override
			public boolean test(Persona p) {
				return p.getEdad() > 18;
			}
		};
		
		if(personaMayorDeEdad.test(persona_2)) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("No es mayor de edad");
		}
		
		System.out.println(" --------- PREDICATE PERSONA MAYOR DE EDAD O MIDE MAS DE 2 METROS --------- ");
		/*
		 * 4. Crear un predicado que evalúe si una persona es mayor de edad o mide más
		 * de 2 metros
		 */
		Predicate<Persona> personaMayorDeEdadOMasDe2Metros = new Predicate<Persona>() {

			@Override
			public boolean test(Persona p) {
				return p.getEdad() > 18 || p.getEstatura() > 2.00;
			}
		};
		
		System.out.println("¿Carlitos es mayor de edad o mide más de 2 metros?");
		if(personaMayorDeEdadOMasDe2Metros.test(persona_1)) {
			System.out.println("Si, cumple con algunas de las condiciones");
		} else {
			System.out.println("No, no cumple con ninguna de las condiciones");
		}
        
		System.out.println(" --------- PREDICATE RECTANGULO CUADRADO --------- ");
		// 5. Crear un predicado que evalúe si un rectángulo es un cuadrado.
		Predicate<Rectangulo> esUnCuadrado = new Predicate<Rectangulo>() {

			@Override
			public boolean test(Rectangulo r) {
				return r.getAltura() == r.getBase();
			}
		};
		
		if(esUnCuadrado.test(rectangulo_2)) {
			System.out.println("Si, el rectangulo es en realidad un cuadrado");
		} else {
			System.out.println("No, es un rectangulo como tal");
		}

		// ---------- Consumer <T> ----------//
		
		System.out.println(" --------- CONSUMER MOSTRAR EDAD PERSONA --------- ");
		// 1. Realizar un consumidor que reciba una persona y muestre su edad por
		// pantalla.
		Consumer<Persona> mostrarEdadPersona = new Consumer<Persona>() {

			@Override
			public void accept(Persona p) {
				System.out.println("Edad de la persona: " + p.getEdad());
			}
		};
		
		mostrarEdadPersona.accept(persona_2);
		
		System.out.println(" --------- CONSUMER MOSTRAR EDAD PERSONA --------- ");
		// 2. Realizar un consumidor que incremente la edad de una persona en 3.
		Consumer<Persona> incrementarEdadPersonaEn3 = new Consumer<Persona>() {

			@Override
			public void accept(Persona p) {
				p.setEdad(p.getEdad() + 3);
			}
		};
		
		System.out.println("Edad de " + persona_1.getNombre() + " " + persona_1.getEdad());
		incrementarEdadPersonaEn3.accept(persona_1);
		System.out.println("Edad de " + persona_1.getNombre() + " despues de 3 años: " + persona_1.getEdad());
		
		System.out.println(" --------- CONSUMER MOSTRAR EDAD PERSONA --------- ");
		/*
		 * 3. Realizar un consumidor que incremente la edad en 3 de una persona y luego
		 * muestre su edad.
		 */
		Consumer<Persona> incrementarEdadPersonaEn3YMostrar = new Consumer<Persona>() {

			@Override
			public void accept(Persona p) {
				int edadPersonaSuma3 = p.getEdad() + 3;
				System.out.println("Edad de la persona: " + edadPersonaSuma3);
			}
		};
		
		incrementarEdadPersonaEn3YMostrar.accept(persona_2);
		
		System.out.println(" --------- CONSUMER TRANSFORMAR RECTANGULO EN CUADRADO --------- ");
		/*
		 * 4. Realizar un consumidor que transforme un rectángulo en un cuadrado,
		 * haciendo que su base pase a valer lo que su altura.
		 */
		Consumer<Rectangulo> transformarEnCuadrado = new Consumer<Rectangulo>() {
			@Override
			public void accept(Rectangulo rectangulo) {
				rectangulo.setBase(rectangulo.getAltura());
			}
		};
		
		System.out.println("Base: " + rectangulo_1.getBase() + ", altura: " + rectangulo_1.getAltura());
		transformarEnCuadrado.accept(rectangulo_1);
		System.out.println("Base: " + rectangulo_1.getBase() + ", altura: " + rectangulo_1.getAltura());

	}

}
