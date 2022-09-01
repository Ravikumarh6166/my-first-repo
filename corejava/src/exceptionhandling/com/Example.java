package exceptionhandling.com;

public class Example {
	
public static void main(String[] args) {
	
	try {
		 System.out.println("files are open");
		 
		 int n = 0 ;
		 System.out.println("n="+n);
		  int a=45/n;
		  System.out.println("a="+a);
	}
	
	catch (ArithmeticException e) {
		System.out.println(e);
		System.out.println("Please pass data while running this program");
	}
	try {
		try {
		int num=Integer.parseInt("Ravikumar");
		System.out.println("num");
	}
	   catch(NumberFormatException e) {
		System.out.println(e);
		System.out.println("Number formate Exception");
	}
	 try {
		int a[]=new int[5];
		a[7]=9;
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("exception Handled");
	}
	 System.out.println("other stament");
	}
	 catch(Exception e) {
		 System.out.println("exception handlled and recovered");
	}
	
	finally {
		System.out.println("close files");
	}
}
}
