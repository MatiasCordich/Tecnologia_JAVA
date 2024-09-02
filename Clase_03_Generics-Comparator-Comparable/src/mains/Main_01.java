package mains;

import utils.AlternadorDeStrings;

public class Main_01 {

	public static void main(String[] args) {
		
		// ----- Creamos el objeto AlternadorDeStrings ----- //
		// Cuando se instancia, el primer valor sera el activo
		AlternadorDeStrings alternador = new AlternadorDeStrings();
		
		// ----- Le seteamos el primer valor ----- //
		alternador.setPrimario("Bien");
		
		// ----- Le seteamos el segundo valor ----- //
		alternador.setSecundario("Mal");
		
		// ----- Alternamos el valor activo ----- //
		alternador.alternar();
		
		// ----- Obtenemos el valor activo del alterandor ----- //
		String valor = alternador.getActivo();
		
		// ----- Mostramos por pantalla el valor activo ----- //
		System.out.println(valor);
	}

}
