package exceptionhandling.com;

public class Example1 {

	public static void main(String[] args) {
     try {
 System.out.println("files are open");
		 
		
		  int b[]= {10,20,30};
		  b[50]=100;
     }
     catch (ArithmeticException ae) {
    	 System.out.println(ae);
    	 System.out.println("Please pass data while running this program");
	}
     catch(ArrayIndexOutOfBoundsException aie)
     {
    	 aie.printStackTrace();
    	 
     System.out.println("Please see that the array index is within the range");
     }
     finally
     {
     System.out.println(" closes the files");	 
     }
	}

}
