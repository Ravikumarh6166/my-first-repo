package com.io.deserializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class AdEmployeeAppReading {
	
public static void main(String[] args) throws Exception {
FileInputStream fis=new FileInputStream("D:\\RAVI\\Has.txt");
ObjectInputStream input=new ObjectInputStream(fis);
Employee e=(Employee)input.readObject();
System.out.println("Id="+e.id+" name="+e.name);
System.out.println("city="+e.address.city+" Taluk="+e.address.Taluk+
		" Dist="+e.address.Dist+" state="+e.address.State);
fis.close();
input.close();
}
}
