package week2;

import java.util.Scanner;

public class AccountApplication {

	 public static void main(String[] args) {
		 AccountDetails appln=new AccountDetails();
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the account number");
		 appln.setAccountnum(scan.nextLong());;
		 System.out.println("Enter the Accountname");
		 appln.setAccountname(scan.next());
		 System.out.println("Enter the emailid");
		 appln.setEmail(scan.next());
		 System.out.println("Enter the amount");
		 appln.setAmount(scan.nextFloat());
		 System.out.println(appln.toString());
	}
}
