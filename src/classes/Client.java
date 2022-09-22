package classes;

import java.util.Objects;

public class Client {
	
	private int idClient;
	private String nom;
	private String prenom;
	private Compte compte;
	
		
	public Client(int idClient, Compte compte) {
		super();
		this.idClient = idClient;
		this.compte = compte;
	}
	public Client(int idClient, String nom, String prenom, Compte compte) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.compte = compte;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idClient);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return idClient == other.idClient;
	}
	
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", prenom=" + prenom + ", nom=" + nom + "]";
	}
	
	
	

}
