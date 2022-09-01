package com.io.deserializable;

public class Student1 extends Person{
	
	double fees;
	String Dept;
	
	public Student1(int id, double fees,String name, String Dept) {
		super(id, name);
		this.fees=fees;
		this.Dept=Dept;
	}

}
