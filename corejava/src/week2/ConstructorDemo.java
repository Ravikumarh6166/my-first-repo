package week2;

public class ConstructorDemo {

	int x;
	int y;
	
	ConstructorDemo(){  // default Constructor
		x=10;
		y=20;
	}
	void display() {
		System.out.println(x+y);
	}
	
	ConstructorDemo(int a, int b){  // parameterized constructor
		x=a;
		y=b;
	}
	
	
	public static void main(String[] args) {
		ConstructorDemo cmd1= new ConstructorDemo();
		cmd1.display();
		
		ConstructorDemo cmd2= new ConstructorDemo(500,600);
		cmd2.display();
	}

}
