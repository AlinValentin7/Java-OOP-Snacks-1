package org.java.oop.snacks;

public class Studente {
private String name;
private String surname;
private int age;

public Studente (String name, String surname, int age){
	this.name = name;
	this.surname = surname;
	this.age = age;
}
public String toString() {
	//String info = name +"-" + surname  + "-" +age;
	return name + "" + surname;
}
}
