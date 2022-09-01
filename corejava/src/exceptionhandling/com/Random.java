package exceptionhandling.com;

public class Random {
public static void main(String[] args) throws Exception {
	
	System.out.println("Random numbesrs between 0 t0 10 ");
	
	while(true) {
		double d=10*Math.random();
		int i=(int)d;
		System.out.println(i);
		Thread.sleep(200);
		if(i==0) {
			System.exit(0);
		}
	}
}
}
