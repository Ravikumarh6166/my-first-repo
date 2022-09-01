package com.io.serializable;

import java.io.Serializable;

public class Student implements Serializable {
	
	public int id;
	int marks;
	String name,dept;
	
	public Student(int id, int marks, String name, String dept) {
		
		this.id = id;
		this.marks = marks;
		this.name = name;
		this.dept = dept;
	}
	
	
	

}
