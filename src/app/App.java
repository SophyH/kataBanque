package app;


import classes.Client;
import classes.Compte;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		Client client = new Client(0, new Compte(0, "mon compte", 100));
		Compte monCompte = client.getCompte();
		
		monCompte.makeWithdrawal(5, monCompte);
		monCompte.makeDeposit(10);
		
		System.out.println(monCompte.checkHistory(monCompte.getOperations()));
		

	}

}
