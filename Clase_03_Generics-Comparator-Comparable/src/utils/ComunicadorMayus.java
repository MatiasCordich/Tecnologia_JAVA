package utils;

import java.util.Scanner;

public class ComunicadorMayus extends Comunicador {

	// -------- ATRIBUTOS --------//
	private Scanner sc;

	// -------- CONSTRUCTOR --------//
	public ComunicadorMayus() {
		this.sc = new Scanner(System.in);
	}

	// -------- METODOS ABSTRACTOS IMPLEMENTADOS --------//
	@Override
	public void enviar(String msg) {
		System.out.println(msg.toUpperCase());
	}

	@Override
	public String recibir() {
		return this.sc.next();
	}
}
