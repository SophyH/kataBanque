package classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Operation {
	
	private int idOperation;
	private Date date;
	private double montant;
	private double balance;
	private String titre;
	private SimpleDateFormat sDF = new SimpleDateFormat("'le' dd/MM/yyyy 'à' hh:mm:ss");;
	
	
		
	public Operation(Date date, double montant, double balance, String titre) {
		super();
		this.date = date;
		this.montant = montant;
		this.balance = balance;
		this.titre = titre;
	}
	public Operation(int idOperation, Date date, double montant, double balance, String titre) {
		super();
		this.idOperation = idOperation;
		this.date = date;
		this.montant = montant;
		this.balance = balance;
		this.titre = titre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idOperation);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Operation other = (Operation) obj;
		return idOperation == other.idOperation;
	}
	
	public int getIdOperation() {
		return idOperation;
	}
	public void setIdOperation(int idOperation) {
		this.idOperation = idOperation;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	@Override
	public String toString() {
		return "Type d'opération = " + titre + " " + sDF.format(date) + ", montant= " + montant + " € "+ ", balance= "
				+ balance + " € ";
	}
	
	
	

}
