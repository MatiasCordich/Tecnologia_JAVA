package utils;

import java.util.Scanner;

public class ComunicadorMinus extends Comunicador {

	// -------- ATRIBUTOS --------//
	private Scanner sc;

	// -------- CONSTRUCTOR --------//
	public ComunicadorMinus() {
		this.sc = new Scanner(System.in);
	}

	// -------- METODOS ABSTRACTOS IMPLEMENTADOS --------//
	@Override
	public void enviar(String msg) {
		System.out.println(msg.toLowerCase());
	}

	@Override
	public String recibir() {
		return this.sc.next();
	}
}
