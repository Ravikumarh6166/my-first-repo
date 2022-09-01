package com.io.deserializable;

import java.io.*;

import com.io.serializable.Student;

public class PsAppDemo {

	public static void main(String[] args) throws Exception {
		
		Student1 s1= new Student1(11, 20000, "Chandana", "Ise");
		
		FileOutputStream fout=new FileOutputStream("D:\\RAVI\\data.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);

		out.writeObject(s1); 
		 
		out.close();    
		System.out.println(" Data written successfully");  
	}

}
