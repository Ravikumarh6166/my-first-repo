package exceptionhandling.com;

public class LogicalError {
	
public static void main(String[] args) {
	
	double sal=5000;
	
	//sal=sal*15/100;   wrong use
	//System.out.println("incremented salary="+sal);
	
	sal=sal+sal*15/100; 
	System.out.println("The incremented salary="+sal);
}
}
