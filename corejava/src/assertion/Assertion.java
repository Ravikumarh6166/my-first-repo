package assertion;

import java.util.Scanner;

public class Assertion {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the age");
    int age=scan.nextInt();
    assert age>=18:"Age not valid";
    System.out.println("Your are eligible to vote="+age);
	}

}
