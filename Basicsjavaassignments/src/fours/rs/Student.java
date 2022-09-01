package fours.rs;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String clss,name;
 Scanner scan=new Scanner(System.in);
 System.out.println("Enter the student name");
 name=scan.nextLine();
 System.out.println("Enter the student class");
 clss=scan.nextLine();
 if(clss.equals("Fourserve") || clss.equals("foursolution") )
 {
	 System.out.println(name+""+"is a student of"+""+clss);
 }
 else {
	System.out.println("Not in this class");
 }
	}

}
