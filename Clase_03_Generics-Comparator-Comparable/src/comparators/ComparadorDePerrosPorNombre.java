package comparators;

import java.util.Comparator;

import models.Perro;

public class ComparadorDePerrosPorNombre
implements Comparator<Perro>{

	// ------ Implementacion logica del metodo compare() ------//
	@Override
	public int compare(Perro perro_1, Perro perro_2) {
		
		// Comparamos la longitud de los nombres de los perros. 
		
		String nombre1 = perro_1.getNombre();
		String nombre2 = perro_2.getNombre();
		
		return nombre1.compareToIgnoreCase(nombre2);
	}

}
