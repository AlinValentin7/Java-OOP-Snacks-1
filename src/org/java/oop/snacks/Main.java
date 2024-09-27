package org.java.oop.snacks;

public class Main {
	public static void main(String[] args) {
		Studente student = new Studente("Liam", "Defois", 23);
		student.getInfo();
		ContoBancario carta = new ContoBancario(2391231);
		carta.depositaDenaro(3421.32);
		carta.getSaldo();
		carta.prelevaDenaro(34);
		System.out.println(carta.getSaldo());
	}
}
