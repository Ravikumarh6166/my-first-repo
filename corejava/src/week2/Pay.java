package week2;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		 double hoursWorked;      
	      double hourlyPayRate;
	      double grossPay ;
	      
 
	      Scanner scan=new Scanner(System.in);
	      System.out.print("How many hours did you work? ");
	      hoursWorked=scan.nextDouble();
	      System.out.print("How much do you get paid per hour? ");
	      hourlyPayRate=scan.nextDouble();
	      
	      if(hoursWorked<=40) {
	    	  grossPay=hoursWorked*hourlyPayRate;
	    	  System.out.println("You earned $" + grossPay);
	      }
	    
	      
	    	  else {
	    		    grossPay=1.5*hoursWorked*hourlyPayRate;
	    		    System.out.println("You earned $" + grossPay);
	    		}

	      double taxes = 0.33*grossPay;  
	      double netPay = grossPay-taxes;
	      System.out.println("Taxes are "+taxes);
	      System.out.println("Your net pay " + netPay);

	     
	      }
	      
	      
	      }
	


