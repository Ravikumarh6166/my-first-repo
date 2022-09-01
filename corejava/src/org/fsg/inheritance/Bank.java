package org.fsg.inheritance;

import java.util.Scanner;

public class Bank {
 protected String name;
 protected int Accountno;
 protected float balance;
 
 Scanner scan =new Scanner(System.in);
 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAccountno() {
	return Accountno;
}
public void setAccountno(int accountno) {
	Accountno = accountno;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}
 
public void input() {
	System.out.println("Enter your name ");
	name=scan.nextLine();
	System.out.println("Enter your account number");
	Accountno=scan.nextInt();
	System.out.println("Enter your intial balance");
	balance=scan.nextFloat();
	
}
 public void display() {
	 System.out.println("Name is="+name);
	 System.out.println("Account number is="+Accountno);
	 System.out.println("balance is="+balance);
 }
 
}
