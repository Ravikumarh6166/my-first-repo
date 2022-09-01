package javadebugging.com;

import java.util.Scanner;

public class DemoApp {

	public void sayHello(String uname) {
		System.out.println("DemoApp.sayHello() ");
		for (int i = 0; i <= 5; i++) {
			System.out.println(uname + "" + i);

		}
		System.out.println("end say hello");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter msg");
		String msg = scan.next();

		displayMsg(msg);
	}

	private void displayMsg(String msg) {
		System.out.println("DemoApp.displayMsg " + msg);
		System.out.println("DemoApp.displayMsg " + msg);
		printNumber(10);
	}

	private void printNumber(int n) {
		System.out.println("DemoApp.printNumber()");
		for (int i = 1; i <= n; ++i) {
			System.out.println(i);
		}
		System.out.println("end");
	}
	
 public void add(int a, int b) {
	 int c=a+b;
	 System.out.println(c);
 }
 public void sub(int a, int b) {
	 int c=a-b;
	 System.out.println(c);
}
}
