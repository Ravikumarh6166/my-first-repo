package exceptionhandling.com;

import java.io.*;

public class IoException {
  
	private String Name;
   //  void accept() {
	
	 void accept() throws IOException {
		 
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter name");
   Name=br.readLine();
   
	}
     void display() {
    	 System.out.println("Name="+Name);
     }
    // In this program, we are using throws clause to throw out an exception
     //without handling it, from a method.
}
