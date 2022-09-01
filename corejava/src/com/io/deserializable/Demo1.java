package com.io.deserializable;

import java.io.*;

import com.io.serializable.Employee;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\RAVI\\mno.txt");
		ObjectInputStream input= new ObjectInputStream(fis);
		Employee e1 = (Employee) input.readObject();
		e1.display();
		input.close();
	}
}
