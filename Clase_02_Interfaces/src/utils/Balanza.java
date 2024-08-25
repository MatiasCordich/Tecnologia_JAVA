package utils;

import interfaces.Pesable;

public class Balanza {

	// ---------- Metodo de la clase Balanza ----------
	public Pesable getMasPesado(Pesable pesable_1, Pesable pesable_2) {

		// Obtengo los pesos de los pesables
		double peso_1 = pesable_1.getPesoEnKg();
		double peso_2 = pesable_2.getPesoEnKg();

		// Como hubise quedado la comparacion si usabamos la estructura IF/ELSE
//		if(peso_1 > peso_2) {
//			return pesable_1;
//		}else {
//			return pesable_2;
//		}
		
		// Utilizo los operadores ternarios
		return peso_1 > peso_2 ? pesable_1 : pesable_2;
	}
}
