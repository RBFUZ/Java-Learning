package com.polytech.bouteloup;

public class TestZoo {

	public static void main(String[] args) {
		Animal[] animaux = new Animal[5];
		animaux[0] = new Animal("Rex", Sexe.MASCULIN);
		animaux[1] = new Mammifère("Médor", Sexe.INDETERMINE);
		animaux[2] = new Humain("Jacques", Sexe.MASCULIN);
		animaux[3] = new Vache("Noiraude", Sexe.FEMININ);
		animaux[4] = new Vache("Gnnnnn", Sexe.MASCULIN);
		
		for(Animal animal : animaux)
			System.out.println(animal.ToString());
	}
}
