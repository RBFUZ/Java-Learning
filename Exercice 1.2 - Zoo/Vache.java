package com.polytech.bouteloup;

public class Vache extends Mammifère{
	
	// Constructors
	public Vache(String nom) {
		this(nom, Sexe.INDETERMINE);
	}
	
	public Vache(String nom, Sexe sexe) {
		super(nom, sexe);
		ModifierNbMamelles(4);
	}
	
	public String ToString() {
		return super.ToString() + "Je suis une vache";
	}
	
}
