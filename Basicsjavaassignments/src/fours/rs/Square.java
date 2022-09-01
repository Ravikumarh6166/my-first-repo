package fours.rs;

import java.util.Scanner;

public class Square {
public static void main(String[] args) {
	int l,b;
	Scanner scan =new Scanner(System.in);
	System.out.println("Eneter the length");
	l=scan.nextInt();
	System.out.println("Eneter the breadth");
	b=scan.nextInt();
	if(l==b)
	{
		System.out.println("Its a Square");
	}
	else {
		System.out.println("Its not a square");
	}
}
}
