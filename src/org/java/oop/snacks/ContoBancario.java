package org.java.oop.snacks;
/*
 *Crea una classe ContoBancario con attributi per numero di conto e saldo.
 *Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero.
 *Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e
 * ottenere il saldo corrente.
 */
public class ContoBancario {
private int numContoBancario;
private double saldo;
public ContoBancario( int numContoBancario){;
	this.saldo = 0.00;
}
public void depositaDenaro (double importo) {
	if(importo > 0.00) {
		saldo = saldo + importo;
		System.out.println("Hai depositato importo: " + importo + "$ " + 
		"saldo attuale: " + saldo +" $");
	}
	else {
		System.out.println("Deposita una somma di denaro maggiore di 0.00 $");
	}
}

public void prelevaDenaro(double importo) {
	if (importo > 0.00) {
		if(saldo >= importo) {
			saldo = saldo - importo;
			System.out.println("Hai prelevato importo: " + importo + "$ " +
	                "saldo attuale: " + saldo + "$");
			}else {
				System.out.println("Saldo insufficente per la somma da lei richiesta");
		}
		
	}else {
		System.out.println("L'importo da prelevare deve essere maggiore di 0.00$");
	}		
}
public double getSaldo (){
	return saldo
			;
}
public int getNumContoBancario() {
	return numContoBancario;
}
}
