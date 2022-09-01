package org.fsg.inheritance;

public class BankApp {

	public static void main(String[] args) {

		Saving saving=new Saving();
		saving.input();
		saving.display();
		saving.Withdraw();
		saving.Deposite();
		
		Fixed_Deposite FixedDeposite=new Fixed_Deposite ();
		FixedDeposite.input();
		FixedDeposite.display();
		
	}

}
