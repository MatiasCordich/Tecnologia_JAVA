package comparators;

import java.util.Comparator;

import models.Perro;

/**
 * Es un comparador que compara objetos de tipo Perro por su nombre.
 * Compara de manera alfabetica. 
 * Ordena de manera creciente
 * @author Profe Niglio
 * */
public class ComparadorDePerrosPorNombre
implements Comparator<Perro>{

	// ------ Implementacion logica del metodo compare() ------//
	
	/**
	 * Compara dos objetos de tipo Perro para ser ordenados alfabeticamente.
	 * @param perro_1 primer perro a comparar. 
	 * @param perro_2 segundo perro a comparar. 
	 * @return Positivo si: perro_1 < perro_2,
	 * Negativo si: perro_1 > perro_2,
	 * Cerro si: perro_1 == perro_2,
	 * */
	@Override
	public int compare(Perro perro_1, Perro perro_2) {
		
		// Comparamos la longitud de los nombres de los perros. 
		
		String nombre1 = perro_1.getNombre();
		String nombre2 = perro_2.getNombre();
		
		return nombre1.compareToIgnoreCase(nombre2);
	}

}
