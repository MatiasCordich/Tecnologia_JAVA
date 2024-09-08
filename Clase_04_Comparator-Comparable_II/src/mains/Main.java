package mains;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import comparators.ComparadorDePerrosPorNombre;
import comparators.ComparadorDePerrosPorApellido;
import models.Perro;

public class Main {

	public static void main(String[] args) {

		// Creo una lista de Perros
		List<Perro> perros = new ArrayList<Perro>();

		// Creo varios objetos de tipo Perro
		Perro perrin1 = new Perro("Pepe", "Lupin", 10);
		Perro perrin2 = new Perro("Chicho", "Buenon", 41);
		Perro perrin3 = new Perro("Firu", "Buenon", 55);
		Perro perrin4 = new Perro("Pippo", "Saltarin", 7);

		// Agrego los perros a la lista
		perros.add(perrin1);
		perros.add(perrin2);
		perros.add(perrin3);
		perros.add(perrin4);

		System.out.println("---------- LISTA Perros ----------");
		for (Perro perro : perros) {
			System.out.println(perro);
		}

		// ------ SORT ------- //
		perros.sort(null);

		System.out.println("-------------- Lista Perros (Criterio natural) --------------");
		for (Perro perro : perros) {
			System.out.println(perro);
		}

		// Creo mi objeto de tipo Comparator
		Comparator<Perro> comparadorPorNombre = new ComparadorDePerrosPorNombre();

		// Le implemento el criterio personalizado del Comparator
		perros.sort(comparadorPorNombre);

		System.out.println("-------------- Lista Perros (Criterio personalizado: NOMBRE) --------------");
		for (Perro perro : perros) {
			System.out.println(perro);
		}

		/*
		 * Creo un mismo Comparador de perros por nombre pero usando el metodo reversed()
		 * Este metodo me crea un nuevo comparador pero cambia el orden de forma decreciente
		 * */
		Comparator<Perro> comparadorPorNombreInvertido = comparadorPorNombre.reversed();

		/*
		 * Le implemento el comparador creado que me devuelve la lista de forma decreciente.
		 * */
		perros.sort(comparadorPorNombreInvertido);

		System.out.println("-------------- Lista Perros (Criterio personalizado: NOMBRE INVERTIDO) --------------");
		for (Perro perro : perros) {
			System.out.println(perro);
		}

		// Creo un objeto que sea un comparador por Apelidos
		Comparator<Perro> comparadorPorApellido = new ComparadorDePerrosPorApellido();

		// Le implemento al sort el criterio del comparador por apellido
		perros.sort(comparadorPorApellido);

		System.out.println("-------------- Lista Perros (Criterio personalizado: APELLIDO) --------------");
		for (Perro perro : perros) {
			System.out.println(perro);
		}

		/*
		 * Creo un comparador que tenga mas criterios de comparacion como el APELLIDO y NOMBRE.
		 * Esto lo hago mediante el metodo thenComparing()
		 * Priero compara por APELLIDO y despues por NOMBRE.
		 * */
		Comparator<Perro> comparadorApellidoYNombre = comparadorPorApellido.thenComparing(comparadorPorNombre);

		// Le implemento al sort el criterio del comparador por apellido y nombre
		perros.sort(comparadorApellidoYNombre);

		System.out.println("-------------- Lista Perros (Criterio personalizado: APELLIDO y NOMBRE) --------------");
		for (Perro perro : perros) {
			System.out.println(perro);
		}

	}

}
