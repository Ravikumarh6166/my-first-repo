package javadebugging.com;

public class Test {
public static void main(String[] args) {
	System.out.println("Start");
	int a=10;
	show();
	a=a++ + ++a - ++a + a++;
	if(a>55) {
		System.out.println("valid");
	}
	else {
	System.out.println("Notvalid");
}
	System.out.println("Done");
}
public static void show() {
	 System.out.println("From method");
	 int k=8;
	 k=k-- + ++k + k++;
	 System.out.println("Data is"+k);
	 System.out.println("exists");
}
}
