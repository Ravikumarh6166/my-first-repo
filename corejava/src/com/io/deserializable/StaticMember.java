package com.io.deserializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StaticMember {

	public static void main(String[] args) throws Exception {
		 Teacher teac= new Teacher(11, "Rutuja");
		// Teacher teac1= new Teacher(12, "RaviRutuja");
			FileOutputStream fout=new FileOutputStream("D:\\RAVI\\staticmember.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(teac);
			//out.writeObject(teac1);
			System.out.println("Data written success");
			fout.close();
			out.close();
	}

}
