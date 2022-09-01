package assignment2;

import java.util.Random;
import java.util.Scanner;

public class AssignmentDie {
	
public static int roll(){
Random random = new Random(); 
int rand_int1 = random.nextInt(6);
return rand_int1+1;

	}
public static boolean equals(int i, int j) {
		if (i==j){
			
			return true;
		}
		return false;
		}
public static String toString (int n){
	
	switch (n)
	{
	case(1):
	return "One";
	
	case (2):
	return "Two";
	
	case (3):
	return "Three";
	
	case (4):
	return "Four";
	
	case(5):
	return "Five";
	
	case (6):
	return "Six";
	}
	
	return "None";	
	
	
}

public static void main(String[] args) {
    
	 double start=10.0;
     System.out.println("You have: rs ="+start);
     Scanner scan=new Scanner(System.in);
     while (start>0) {
     System.out.println("How much rs would you like to bet?");
     
     double betAmount=scan.nextDouble();
     int roll1=roll();
     int roll2=roll();
     System.out.println("You rolled "+toString(roll1)+" and "+toString(roll2));
     boolean win;
     win= equals(roll1,roll2);
     
     if (win) {
    	 
    	 System.out.println("You win $"+betAmount*2);
    	 start+=2*betAmount;
    	 
     }
     else
    	 System.out.println("You lost $"+betAmount*2);
    	 start-=betAmount;
     }
     System.out.println("Better luck next time");


}

}
