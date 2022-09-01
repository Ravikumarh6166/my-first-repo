package exceptionhandling.com;

import java.util.Scanner;

public class MyException extends Exception {
  private static int id=1001;
  private static String name="Turner";
  
  MyException(){
	  
  }
  MyException(String str){
	  super(str);
  }
  public static void main(String[] args) {
	try {
		System.out.println("id="+id+" name="+name);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The id");
		id=scan.nextInt();
		if(id!=1001) {
			MyException me=new MyException("Id is not Equal to given id");
			throw me;
		}
	}
		catch(MyException me) {
			me.printStackTrace();
		}
  }

}
