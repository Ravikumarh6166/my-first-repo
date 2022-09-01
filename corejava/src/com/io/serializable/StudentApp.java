package com.io.serializable;

import java.io.*;

public class StudentApp  {

	public static void main(String[] args) throws Exception {
		
Student s1= new Student(11, 78, "Chandana", "Ise");

FileOutputStream fout=new FileOutputStream("D:\\RAVI\\pqr.txt");

ObjectOutputStream out=new ObjectOutputStream(fout);

out.writeObject(s1); 
 
out.close();    
System.out.println(" Data written successfully");    
	}

}
