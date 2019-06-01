package org.formation.lanceur;

import org.formation.model.Compte;

public class Main {

	public static void main(String[] args) {
		
		
		// Edition du fichier
		System.out.println("Coucou Chloé, bien reçu ?!");
		System.out.println("On essaye de faire un pull ?");

		
		Compte compteMaxime = new Compte(500000);
		Compte compteChloe = new Compte(400000);
		double montant = 100000;
		
		compteChloe.setSolde(compteChloe.getSolde()+montant);
		compteMaxime.setSolde(compteMaxime.getSolde()-montant);
		
		System.out.println("Chloe"+compteChloe);
		System.out.println("Maxime"+compteMaxime);
	}

}
