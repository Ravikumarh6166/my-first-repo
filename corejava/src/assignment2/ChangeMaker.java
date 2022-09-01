package assignment2;

import java.util.Scanner;


public class ChangeMaker {

	public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter the amount customer to be paid");
  int customeramountpaid=scan.nextInt();
  System.out.println("Enter the amount customer owed");
  int customeramountowed=scan.nextInt();
  System.out.println("their change is="+( customeramountpaid-customeramountowed));
  int value= customeramountpaid-customeramountowed;
  
  
  if(value > 0) {
	  
	  int amount=customeramountpaid-customeramountowed;
 	
 		 int dollars=amount/100;
 		 amount-=dollars*100;
 		int  quaters=amount/25;
 		 amount-=quaters*25;
 		int dimes=amount/10;
 		 amount-=dimes*10;
 		int nickels=amount/5;
 		 amount-=nickels*5;
 		int pennies= amount;
 		 
 		
 		 System.out.print("The original amount spent in="+"dollars="+dollars+" quaters="+quaters+"  "
 		 		+ " dimes="+dimes+"   nickles="+nickels+"   pennies="+pennies);
 	 
  }
  else {
 	 System.out.print("");
  }
 

	}

}
