package com.io.serializable;

import java.io.*;

public class EmployeeApp {

	public static void main(String[] args) throws Exception {
Employee emp= new Employee(12, "Chandana", 15000);
FileOutputStream fout=new FileOutputStream("D:\\RAVI\\mno.txt");
ObjectOutputStream out=new ObjectOutputStream(fout);

out.writeObject(emp); 
 
out.close();    
System.out.println(" Data written successfully"); 
	}

}
