package org.java.oop.snacks;
/*
 * Crea una classe RegistroStudenti 
 * che rappresenti un registro di studenti. 
 * Utilizza un array privato per memorizzare oggetti Studente.
 *  Implementa un costruttore senza parametri per inizializzare il registro vuoto
 *   e un metodo pubblico per aggiungere studenti al registro. 
 *   Aggiungi un metodo che stampi la lista degli studenti.*/
public class RegistroStudenti {
private Studente []registro;
private int nStudents;

public RegistroStudenti(){
	registro = new Studente [50];
	nStudents = 0;
}
public void addStudent (Studente student) {
	if(nStudents < registro.length) {
		registro[nStudents] = student;
		nStudents = nStudents + 1;
	}else {
		System.out.println("Il registro è pieno");
	}
} 
public void listaStudenti() {
	if(nStudents < 0) {
		System.out.println("Il regisrto è vuoto");
	}else {
		System.out.println("la lista degli studenti è: ");
		for(int i = 0; i < registro.length; i++) {
			System.out.println(registro[i]);
			
		}
		
	}
	
}
}
