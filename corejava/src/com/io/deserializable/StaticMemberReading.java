package com.io.deserializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

import com.io.serializable.Employee;

public class StaticMemberReading {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:\\RAVI\\staticmember.txt");
		ObjectInputStream input = new ObjectInputStream(fis);
		Teacher t = (Teacher) input.readObject();
		//Teacher t1 = (Teacher) input.readObject();
		System.out.println("Id=" + t.id + " name=" + t.name+" SchoolName="+t.SchoolName);
		//System.out.println("Id=" + t1.id + " name=" + t1.name+" SchoolName="+t1.SchoolName);
		fis.close();
		input.close();
	}

}
