package org.formation.lanceur;

import org.formation.model.Client;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Coucou Maxime, bien re�u ?!");

		// Cr�ation d'un nouveau client, et affichage de ses attributs
		Client c = new Client("Chlo�", "Spinnato", "f�minin");
		System.out.println("Le " +c.getClass().getSimpleName() + " au nom de " + c.getPrenomClient() +" " + c.getNomClient() + " est du genre " + c.getGenre());
		
		
	}

}
