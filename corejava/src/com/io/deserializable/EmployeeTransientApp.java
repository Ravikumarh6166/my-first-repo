package com.io.deserializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeTransientApp {

	public static void main(String[] args) throws Exception {
		EmployeeTransient empt=new EmployeeTransient(11, "satish");
		FileOutputStream fout=new FileOutputStream("D:\\RAVI\\transient.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(empt);
		out.close();
		System.out.println("Data written success");
	}

}
