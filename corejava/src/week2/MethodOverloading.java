package week2;

public class MethodOverloading {

	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	void add(int a, double b) {
		System.out.println(a+b);
	}
	
	void add(double  a, double b) {
		System.out.println(a+b);
	}
	
	void add(int a, double b,String c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
    
		MethodOverloading moMethodOverloading=new MethodOverloading();
		moMethodOverloading.add(175, 275);
		moMethodOverloading.add(165, 105.55);
		moMethodOverloading.add(155.232, 78.254);
		moMethodOverloading.add(14, 12.5, "raj");
	}

}
