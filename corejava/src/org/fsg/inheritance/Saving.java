package org.fsg.inheritance;

public class Saving extends Bank{
public void Withdraw() {
	
	int withdraw;
	System.out.println("Enter the amount to be withdrawn ");
	withdraw=scan.nextInt();
	if(withdraw<=balance) {
		balance-=withdraw;
		System.out.println("Afetr Withdrawn balance="+balance);
	}
	else
		System.out.println("Insufficient balance");
	
}
public void Deposite() {
	int Deposite;
	System.out.println("Enter the amount to be deposite");
	Deposite=scan.nextInt();
	balance+=Deposite;
	System.out.println("After deposite created balance= "+balance);
}
}
