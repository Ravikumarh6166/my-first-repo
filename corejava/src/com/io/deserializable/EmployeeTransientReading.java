package com.io.deserializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class EmployeeTransientReading {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:\\RAVI\\transient.txt");
		ObjectInputStream input = new ObjectInputStream(fis);
		EmployeeTransient trans = (EmployeeTransient) input.readObject();
		System.out.println("Id="+trans.id+" name="+trans.name);
	}

}
