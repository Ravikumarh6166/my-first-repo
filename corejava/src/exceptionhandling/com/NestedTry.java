package exceptionhandling.com;

import java.io.*;

public class NestedTry {

	public static void main(String[] args) throws IOException {
      try {
    	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	  System.out.println("Enter Value");
    	  String stra=br.readLine();
    	  int a=Integer.parseInt(stra);
    	  System.out.println("Enter b value:");
		 int b=Integer.parseInt(br.readLine());
    	 
    	  int c=a/b;
    	  System.out.println("c="+c);
      
      try {
    	  int x[]=new int[5];
    	  x[10]=5;
      }
      catch(ArrayIndexOutOfBoundsException aie) {
    	  System.out.println(aie);
      }
      finally {
    	  System.out.println("inner finally");
      }
      }
      catch(ArithmeticException ae) {
    	  System.out.println(ae);
      }
      finally {
    	  System.out.println("outer finally");
      }
      System.out.println("end of the program");
	}

}
