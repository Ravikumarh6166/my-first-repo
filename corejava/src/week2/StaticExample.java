package week2;

public class StaticExample {

	static int a=100;
	int b=200;
	
	static void m() {
		System.out.println("This is m method static Block");
	}
	
	 void m1() {
			System.out.println("This is m1 method non static Block");
		}
	 
	 void m2() {
		 System.out.println("This m2 method is non static block");
		 System.out.println(a);
		 System.out.println(b);
		 m();
		 m1();
		 
	 }
	 
	 
	 
	 
	
	public static void main(String[] args) {
  System.out.println(a);
  m();
  System.out.println();
  
  System.out.println(StaticExample.a);
  StaticExample.m();
  System.out.println();
  
  StaticExample StaticExample=new StaticExample();
  System.out.println(StaticExample.b);
  StaticExample.m1();
  System.out.println();
  StaticExample.m2();
	}

}
