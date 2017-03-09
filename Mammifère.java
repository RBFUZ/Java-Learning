package com.polytech.bouteloup;

public class Mammif�re extends Animal {

	// Attributes
	private int nbMamelles;
	
	// Constructors
	public Mammif�re(String nom) {
		this(nom, Sexe.INDETERMINE);
	}
	
	public Mammif�re(String nom, Sexe sexe) {
		super(nom, sexe);
	}
	
	protected int LectureNbMamelles() {
		return nbMamelles;
	}
	
	protected void ModifierNbMamelles(int nombre) {
		nbMamelles = nombre;
	}
	
	public String ToString() {
		return super.ToString() + "Je suis un mammif�re.";
	}
}