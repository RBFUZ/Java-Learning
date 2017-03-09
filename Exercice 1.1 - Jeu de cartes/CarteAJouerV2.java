package com.polytech.bouteloup;

public class CarteAJouerV2 {

	// Attributes
	private String couleur, valeur;
	public static final int NBR_CARTES = 52;
	public static final String COULEUR_VALIDES[] = {"Coeur", "Pique", "Carreau", "Trefle"};
	public static final String VALEUR_VALIDES[] = {"Un", "Deux", "Trois", "Quatre", "Cinq", "Six", "Sept", "Huit", "Neuf", "Dix", "Dame", "Vallet", "Roi"};
	private static CarteAJouerV2[] mesCartes = new CarteAJouerV2[NBR_CARTES];
	
	// Constructor
	public CarteAJouerV2(String coul, String val){
		couleur = coul;
		valeur = val;
	}
	
	public String toString() {
		
		String chaine = "test";
		
		for (CarteAJouerV2 carte : mesCartes)
		{
			System.out.println(carte.valeur + " de " + carte.couleur);
		}
		return chaine;
	}
	
	public static void main(String[] args)
	{
		int eBoucle = 0;
	
		for (String val : VALEUR_VALIDES)
		{
			for (String coul : COULEUR_VALIDES)
			{
				mesCartes[eBoucle] = new CarteAJouerV2(coul, val);
				eBoucle++;
			}
		}
	CarteAJouerV2 test = new CarteAJouerV2("coeur", "test");
	test.toString();
	}
}
