package fr.polytech.bouteloup;

import java.util.StringTokenizer;

public class MyStringBuilder {

	// Methods
	public static String removeAllCharsFromStringBuilder(String refString, String charSet) {
		
		StringBuilder sMSBResultat = new StringBuilder(refString);
				
		int eBoucleCharSet = 0;
		int eIndex = 0;
		
		while (eBoucleCharSet < charSet.length()) {
			while (sMSBResultat.toString().indexOf(charSet.charAt(eBoucleCharSet)) != -1) {
				eIndex = sMSBResultat.toString().indexOf(charSet.charAt(eBoucleCharSet));
				sMSBResultat.deleteCharAt(eIndex);
			}
			eBoucleCharSet++;
		}
		return sMSBResultat.toString();
	}
	
	public static String removeAllCharsFromStringTokenizer(String refString, String charSet) {
		
		StringTokenizer sMSBResultat = new StringTokenizer(refString);
		refString = "";

		// Sans espace on peut écrire refString += remove ...
		while (sMSBResultat.hasMoreTokens()) {
			refString += " " + removeAllCharsFromStringBuilder(sMSBResultat.nextToken().toString(), charSet);
		}
		return refString;
		
	}
	
	
	public static void main (String[] args) {
		
		System.out.println(removeAllCharsFromStringTokenizer("je suis malade mais je penffsdfsfsse que je vais m en sortir", "aemjsir"));
	}
}
