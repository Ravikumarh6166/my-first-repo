package org.fsg.inheritance;

public class Fixed_Deposite extends Bank{
 private float time,rate;
 public void input() {
	 super.input();
	 
	 System.out.println("Enter rate of interest");
	 rate=scan.nextFloat();
	 System.out.println("Enter the time Duration");
	 time=scan.nextFloat();
 }
 public void display() {
	 super.display();
	 
	 float interest=balance*rate*time/100;
	 System.out.println("Maturity amount is="+(balance+interest));
 }
}
