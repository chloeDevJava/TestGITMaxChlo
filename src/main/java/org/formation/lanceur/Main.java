package org.formation.lanceur;

import org.formation.model.Compte;
import org.formation.model.Client;

public class Main {

	public static void main(String[] args) {

		// Edition du fichier
		System.out.println("Coucou Chloé, bien reçu ?!");
		System.out.println("On essaye de faire un pull ?");

		Compte compteMaxime = new Compte(500000);
		Compte compteChloe = new Compte(400000);
		double montant = 100000;

		compteChloe.setSolde(compteChloe.getSolde() + montant);
		compteMaxime.setSolde(compteMaxime.getSolde() - montant);

		System.out.println("Chloe" + compteChloe);
		System.out.println("Maxime" + compteMaxime);

		// Création d'un nouveau client, et affichage de ses attributs
		Client c = new Client("Chloé", "Spinnato", "féminin");
		System.out.println("Le " + c.getClass().getSimpleName() + " au nom de " + c.getPrenomClient() + " "
				+ c.getNomClient() + " est du genre " + c.getGenre());

	}

}
