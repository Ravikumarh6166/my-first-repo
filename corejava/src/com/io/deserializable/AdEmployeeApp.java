package com.io.deserializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AdEmployeeApp {

	public static void main(String[] args) throws Exception {
Address address=new Address("Chadchan", "Indi","Bijapur", "Kar");
Employee e1=new Employee(11, "Ravikumar", address);
FileOutputStream fout=new FileOutputStream("D:\\RAVI\\Has.txt");
ObjectOutputStream out=new ObjectOutputStream(fout);

out.writeObject(e1); 
 
out.close();    
System.out.println(" Data written successfully"); 
	}

}
