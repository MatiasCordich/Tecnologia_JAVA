package mains;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import comparators.ComparadorDePerrosPorNombre;
import models.Perro;

public class Main_04 {

	public static void main(String[] args) {
		
		// Creo una lista de Perros
		List<Perro> perros = new ArrayList<Perro>();
		
		// Creo varios objetos de tipo Perro 
		Perro perrin1 = new Perro("Pepe", 10);
		Perro perrin2 = new Perro("Chicho", 41);
		Perro perrin3 = new Perro("Firu", 55);
		Perro perrin4 = new Perro("Pippo", 7);
		
		// Agrego los perros a la lista
		perros.add(perrin1);
		perros.add(perrin2);
		perros.add(perrin3);
		perros.add(perrin4);
		
		// Utilizo Collections para sacar el valor maximo y minimo de la lista 
		// El criterio que utiliza es el criterio natural del Comparable (el peso)
		Perro perroMax = Collections.max(perros); 
		Perro perroMin = Collections.min(perros); 
		
		System.out.println(perroMax); // Perro [nombre=Firu, pesoEnKg=55.0]
		System.out.println(perroMin); // Perro [nombre=Pippo, pesoEnKg=7.0]
		
		// ------ SORT ------- //
		perros.sort(null);
		
		System.out.println("-------------- Lista con sort (Criterio natural) --------------");
		for (Perro perro : perros) {
			System.out.println(perro);
		}
		
		// Creo mi objeto que es un Comparator
		ComparadorDePerrosPorNombre compi = new ComparadorDePerrosPorNombre();
		
		// Le implemento el criterio personalizado del Comparator
		perros.sort(compi);
		
		System.out.println("-------------- Lista con sort (Criterio personalizado) --------------");
		for (Perro perro : perros) {
			System.out.println(perro);
		}

	}

}
