package com.polytech.bouteloup;

public class Humain extends Mammifère {
	
	// Constructors
	public Humain(String nom) {
		this(nom, Sexe.INDETERMINE);
	}
	
	public Humain(String nom, Sexe sexe) {
		super(nom, sexe);
		ModifierNbMamelles(2);
	}
	
	public String ToString() {
		return super.ToString() + "Je suis un humain.";
	}
}