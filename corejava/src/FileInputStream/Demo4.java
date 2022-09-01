package FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo4 {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("D:\\RAVI\\corejava\\src\\corejava"
				+ "\\com\\star.java");
		
System.out.print(fin.available());// it produced how much data byte presented in file 
	    
		int size=fin.available();
		
		
		//byte[] data=new byte[204];
		
		byte[] data=new byte[size]; 
		fin.read(data);// data from file stored into data[] 
		
		fin.close();
		String msg=new String(data);// byte array to string
		System.out.print(msg);
	}

}

