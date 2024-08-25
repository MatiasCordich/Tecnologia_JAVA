package mains;

import interfaces.Pesable;
import models.BotellaDeAgua;
import models.Perro;
import utils.Balanza;

public class Main_01 {

	public static void main(String[] args) {
		
		// ------ Creo mi primer objeto pesable de tipo Perro ------
		Pesable pesable_1 = new Perro("Pippo", 5);
		
		// ----- Usamos los metodos que tiene el pesable_1 de tipo Perro ----- 
		System.out.println(pesable_1.getPesoEnKg());
		System.out.println(pesable_1.getPesoEnGr());
		System.out.println(pesable_1.getPesoEnMg());
		
		System.out.println("-----------------------------------------------");
		
		// ------ Creo mi segundo objeto pesable de tipo BotellaDeAgua ------
		Pesable pesable_2 = new BotellaDeAgua(20);
				
		// ----- Usamos los metodos que tiene el pesable_1 de tipo Perro ----- 
		System.out.println(pesable_2.getPesoEnKg());
		System.out.println(pesable_2.getPesoEnGr());
		System.out.println(pesable_2.getPesoEnMg());
		
		System.out.println("-----------------------------------------------");
		
		// ----- Creo mi objeto de tipo Balanza -----
		Balanza bal = new Balanza();
		
		// ----- Obtengo el objeto de tipo pesable mas pesado usando el metodo de Balanza -----
		Pesable masPesado = bal.getMasPesado(pesable_1, pesable_2);
		
		// ----- Muestro por pantalla el valor del objeto mas pesado -----
		System.out.println("Mas pesado: " + masPesado.getPesoEnKg());
		

	}

}
