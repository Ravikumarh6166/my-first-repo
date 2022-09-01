package com.io.deserializable;

import java.io.*;


public class PsAppDemoReading {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\RAVI\\data.txt");
		ObjectInputStream out = new ObjectInputStream(fis);
		
		Student1 s = (Student1) out.readObject();
	
		
		System.out.println(s.id+" "+s.fees+" "+s.name+" "+s.Dept);
		
		fis.close();
		out.close();
		
	}

	}


