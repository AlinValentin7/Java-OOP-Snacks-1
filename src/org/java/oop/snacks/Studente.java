package org.java.oop.snacks;

public class Studente {
private String name;
private String surname;
private int age;

Studente (String name, String surname, int age){
	this.name = name;
	this.surname = surname;
	this.age = age;
}
public void getInfo() {
	String info = name +"-" + surname + "-" + "-" +age;
	System.out.println("Le info del sutende sono: "+info);
}
}
