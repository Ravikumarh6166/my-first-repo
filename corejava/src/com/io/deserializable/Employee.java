package com.io.deserializable;

import java.io.Serializable;

public class Employee implements Serializable {
	
	int id;
	String name;
	Address address;
	
public Employee(int id, String name, Address address) {
		
		this.id = id;
		this.name = name;
		this.address = address;
	}



}
