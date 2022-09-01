package com.io.serializable;

import java.io.Serializable;

public class Employee implements Serializable{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
public void display() {
	System.out.println("id="+id);
	System.out.println("name="+name);
	System.out.println("salary="+salary);
}
}
