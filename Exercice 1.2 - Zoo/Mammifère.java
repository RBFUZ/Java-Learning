package com.polytech.bouteloup;

public class Mammifère extends Animal {

	// Attributes
	private int nbMamelles;
	
	// Constructors
	public Mammifère(String nom) {
		this(nom, Sexe.INDETERMINE);
	}
	
	public Mammifère(String nom, Sexe sexe) {
		super(nom, sexe);
	}
	
	protected int LectureNbMamelles() {
		return nbMamelles;
	}
	
	protected void ModifierNbMamelles(int nombre) {
		nbMamelles = nombre;
	}
	
	public String ToString() {
		return super.ToString() + "Je suis un mammifère.";
	}
}