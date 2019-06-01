package org.formation.model;

public class Client {

	// Attributs

	private String prenomClient;
	private String nomClient;
	private String genre;

	// Constructeurs

	public Client(String prenomClient, String nomClient, String genre) {
		super();
		this.prenomClient = prenomClient;
		this.nomClient = nomClient;
		this.genre = genre;
	}

	public Client() {
		super();
	}

	// Getters & Setters

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	// To String

	@Override
	public String toString() {
		return "Client [prenomClient=" + prenomClient + ", nomClient=" + nomClient + ", genre=" + genre + "]";
	}

}
