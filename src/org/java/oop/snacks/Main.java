package org.java.oop.snacks;

public class Main {
	public static void main(String[] args) {
		Studente student1 = new Studente("Liam", "Defois", 56);
		Studente student2 = new Studente("Liam", "Galaggher", 34);
		Studente student3 = new Studente("Liam", "Wilson", 100);
		Studente student4 = new Studente("Liam", "Bra", 43);
		Studente student5 = new Studente("Liam", "Mail", 88);
		student1.toString();
		ContoBancario carta = new ContoBancario(2391231);
		carta.depositaDenaro(3421.32);
		carta.getSaldo();
		carta.prelevaDenaro(34);
		System.out.println(carta.getSaldo());
		RegistroStudenti registro = new RegistroStudenti();
		RegistroStudenti studente1 = new RegistroStudenti();
		RegistroStudenti studente2 = new RegistroStudenti();
		RegistroStudenti studente3 = new RegistroStudenti();
		RegistroStudenti studente4 = new RegistroStudenti();
		RegistroStudenti studente5 = new RegistroStudenti();
		studente1.addStudent(student1);
		studente2.addStudent(student2);
		studente3.addStudent(student3);
		studente4.addStudent(student4);
		studente5.addStudent(student5);
		registro.listaStudenti();
		
	}
}
