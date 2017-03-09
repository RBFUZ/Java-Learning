package com.polytech.bouteloup;

public class CarteAJouer {

	// Attributes
	public static final String COULEUR_VALIDES[] = {"Coeur", "Pique", "Carreau", "Trefle"};
	public static final String VALEUR_VALIDES[] = {"Un", "Deux", "Trois", "Quatre", "Cinq", "Six", "Sept", "Huit", "Neuf", "Dix", "Dame", "Vallet", "Roi"};
	private String couleur, valeur;
	
	// Constructor
	public CarteAJouer(String coul, String val)
	{
		if (couleurEstValide(coul)) {
			couleur = coul;
		}
		else {
			throw new IllegalArgumentException("Couleur invalide");
		}
		
		if (valeurEstValide(val)) {
			valeur = val;
		}
		else {
			throw new IllegalArgumentException("Valeur invalide");
		}
	}
	
	// Methods
	public String getCouleur() {
		return couleur;
	}
	
	public String getValeur() {
		return valeur;
	}
	
	public String toString() {
		return valeur + " de " + couleur;
	}
	
	private boolean couleurEstValide(String coul)
	{
		for (String couleur : COULEUR_VALIDES)
		{
			if (couleur.equalsIgnoreCase(coul)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean valeurEstValide(String val)
	{
		for (String valeur : VALEUR_VALIDES)
		{
			if (valeur.equalsIgnoreCase(val))
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		try
		{
			CarteAJouer QuatreDePique = new CarteAJouer("PIQUE", "Quatre");
			CarteAJouer SeptDeCoeur = new CarteAJouer("Coeur", "Sept");
			CarteAJouer RoiDeTrefle = new CarteAJouer("Trefle", "Roi");
			
			System.out.println("Carte QuatreDePique : val = " + QuatreDePique.valeur + " : couleur = " + QuatreDePique.couleur);
			System.out.println("Carte SeptDeCoeur : val = " + SeptDeCoeur.valeur + " : couleur = " + SeptDeCoeur.couleur);
			System.out.println("Carte RoiDeTrefle : val = " + RoiDeTrefle.valeur + " : couleur = " + RoiDeTrefle.couleur);
			System.out.println("Description : " + QuatreDePique.toString());
			System.out.println("Description : " + SeptDeCoeur.toString());
			System.out.println("Description : " + RoiDeTrefle.toString());
			
		}catch (IllegalArgumentException e) {
			System.out.println(e);
		}
	}
}
