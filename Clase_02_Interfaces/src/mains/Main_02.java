package mains;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_02 {

	public static void main(String[] args) {

		// ----- Creamos una lista a la que no le especifica el tipo de dato -----
		ArrayList listaCaotica = new ArrayList();

		// ----- Como no se le especifica, podemos guardar cualquier cosa -----
		listaCaotica.add("Hola"); // Añadimos un String
		listaCaotica.add(123); // Añadimos un Integer
		
		Scanner sc = new Scanner(System.in);
		
		listaCaotica.add(sc); // Añadimos un objeto de tipo Scanner
		
		// ------ PRIMER PROBLEMA: CASTEO OBLIGATORIO ------
		// Al recuperar los elementos, necesitamos hacer casting
        String texto = (String) listaCaotica.get(0);
        System.out.println(texto);

     // ------ SEGUDNO PROBLEMA: PROBLEMAS DE CASTEO ------
     // Si intentamos recuperar un elemento con el tipo incorrecto, habrá un error
     //String scannerTipoString = (String) listaCaotica.get(2);  // Esto lanzará ClassCastException

	}

}
