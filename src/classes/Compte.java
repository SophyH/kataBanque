package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Compte {
	
	private int idCompte;
	private String TypeCompte;
	private double solde;
	private List<Operation> operations;
	private Client client;
		
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Compte(int idCompte, String typeCompte, double solde) {
		super();
		this.idCompte = idCompte;
		TypeCompte = typeCompte;
		this.solde = solde;
	}
	
	public int getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	public String getTypeCompte() {
		return TypeCompte;
	}
	public void setTypeCompte(String typeCompte) {
		TypeCompte = typeCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public List<Operation> getOperations() {
		return operations;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idCompte);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		return idCompte == other.idCompte;
	}
	
	public boolean makeDeposit(double montant) {
		if (montant > 0) {
			this.solde += montant;
			if (this.operations == null) {
				this.operations = new ArrayList<Operation>();
			} 
			this.operations.add(new Operation(new Date(), montant, this.solde, "dépot"));
			return true;
		} 
		return false;
		}
	
	public boolean makeWithdrawal(double montant, Compte compte) {
		if (montant > 0 && montant <= this.solde) {
			this.solde -= montant;
			if (this.operations == null) {
				this.operations = new ArrayList<Operation>();
			} 
			this.operations.add(new Operation(new Date(), montant, this.solde, "retrait"));
			return true;
		}
		return false;
	}
	
	public String checkHistory(List<Operation> operations) {
		StringBuilder strB = new StringBuilder();
		for(Operation o : operations) {
			strB.append(o.toString()+" \n");
		}
		return strB.toString();
	}

}
