package comparators;

import java.util.Comparator;

import models.Perro;

public class ComparadorDePerrosPorNombre
implements Comparator<Perro>{

	@Override
	public int compare(Perro perro_1, Perro perro_2) {
		
		String nombre1 = perro_1.getNombre();
		String nombre2 = perro_2.getNombre();
		
		return nombre1.compareToIgnoreCase(nombre2);
	}

}
