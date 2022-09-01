package exceptionhandling.com;

public class MultipleCatch {

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
      catch(Exception e) {
  		System.out.println(e);
  		System.out.println("exception Handled");
  	}

}
}
