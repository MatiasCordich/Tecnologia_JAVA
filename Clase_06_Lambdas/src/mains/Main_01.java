package mains;

import java.util.function.Predicate;

import interfaces.Comunicador;
import interfaces.Pesable;

public class Main_01 {

	public static void main(String[] args) {
		
		// ----- Creamos una clase anonima con la interfaz Pesable ----- // 
		Pesable pesablilin = new Pesable() {

			@Override
			public double getPesoEnGr() {
				return 1874;
			}
		};
		
		// ----- Creamos otra clase anonima con la interfaz Pesable pero usando la funcion lambda ----- //
		Pesable pesi = () -> 1453;

		System.out.println(pesablilin.getPesoEnKg());

		// ----- Creamos una clase anonima con la interfaz Predicate ----- // 
		Predicate<Integer> esPar = new Predicate<Integer>() {
			@Override
			public boolean test(Integer i) {
				return i % 2 == 0;
			}
		};

		// ----- Creamos otra clase anonima con la interfaz Predicate usando la funcion lambda ----- //
		Predicate<Integer> esParLamda = (Integer i) -> {
			return i % 2 == 0;
		};

		// ----- Creamos otra clase anonima simplificando mas la funcion lambda ----- //
		Predicate<Integer> esParLambaLinda = (Integer i) -> i % 2 == 0;

		// ----- Creamos otra clase anonima simplificando lo maximo posible la funcion lambda ----- //
		Predicate<Integer> esParPerfecta = i -> i % 2 == 0;

		// La funcion negate() devuelve el valor booleano invertido. 
		esParPerfecta.negate();
		
		// ----- Creamos una clase anonima con la interfaz Comunicador ----- //
		Comunicador comu = new Comunicador() {
			
			/*
			 * Solo podemos sobreescribir las funciones de esta interfaz de esta manera, 
			 * ya que al no ser una interfaz funcional no puedo hacer una funcion lambda porque
			 * al tener mas de una funcion abstracta, da lugar a la ambiguedad. 
			 * */
			
			@Override
			public String recibir() {
				return "Hola";
			}
			
			@Override
			public void enviar(String msj) {
		            System.out.println(msj);
			}
		};
		
		comu.enviar("Que ondaaaa?");

	}

}
