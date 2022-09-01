package assignment2;

import java.util.Scanner;
import java.lang.Math;

public class BigAndSmall {
	

	public static void main(String[] args) {
          
		double Max=0;
		double Min=0;
		double count=0;
		double sum=0;
		double number;
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number or 0 to quite");
		number=scan.nextDouble();
		 if(number!=0) {
	    	 count+=1;
	    			 if (number>Max) 
	    			 {
	    				 Max=number;
	    			 }
	    	         if (number<Min) 
	    	         {
	    	        	 Min=number;
	    	         }
	    	         
	    	         sum+=number;
	     }
		 while(number!=0) {
		 
         if (Min==0 && Max==0 && number==0)
         {
       System.out.println("You did not enter any number");
         }
	    	 System.out.println("Maximum number:"+Max);
	    	 System.out.println("Minimum number:"+Min);
	    	 System.out.println("Average number:"+sum/count);
	    	 
	    	 break;
		
	}
	}

}
