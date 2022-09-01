package fours.rs;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
Scanner scan =new Scanner(System.in);
System.out.println("Enter the age of a");
a=scan.nextInt();
System.out.println("Enter the age of b");
b=scan.nextInt();
System.out.println("Enter the age of c");
c=scan.nextInt();
if(a>b && a>c) {
	System.out.println("A is oldest");
}
	else if(b>a && b>c) {
		System.out.println("B is oldest");
	}
	else {
		System.out.println("C is the oldest");
	}
if(a<b && a<c) {
	System.out.println("A is youngest");
}
	else if(b<a && b<c) {
		System.out.println("B is youngest");
	}
	else {
		System.out.println("C is the youngest");
	}
}
	}


