package com.polytech.bouteloup;

public class Animal {
	
	// Attributes
	private String nom;
	private Sexe sexe;
	private static int counter;
	
	// Constructors
	public Animal(String nom) {
		this(nom, Sexe.INDETERMINE);
	}
	
	public Animal(String nom, Sexe sexe) {
		this.nom = nom;
		this.sexe = sexe;
		counter++;
	}
	
	public String ToString() {
		return "Je suis un Animal de nom " + nom + " et de sexe " + sexe;
	}
}