package assertion;

import java.util.Scanner;

public class ssertionExample {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
     System.out.println("Enter the age between 18 to 60");
     int age=scan.nextInt();
     assert (age>=18 && age<=60):"For Schoolarship";
     System.out.println("Your are eligible for Schoolarship="+age);
     
	}

}
