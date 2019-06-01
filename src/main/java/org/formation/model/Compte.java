package org.formation.model;

public class Compte {

	private Long idCompte;
	private double solde;

	// Constructeurs
	public Compte() {
		super();
	}

	public Compte(double solde) {
		super();
		this.solde = solde;
	}

	public Compte(Long idCompte, double solde) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
	}

	// Getters and setters

	public Long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	// toString
	
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", solde=" + solde + "]";
	}

	
	
}
