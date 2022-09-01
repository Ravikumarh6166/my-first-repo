package com.io.deserializable;

import java.io.Serializable;

public class EmployeeTransient  implements Serializable{
transient int id;
String name;
public EmployeeTransient(int id, String name) {
	
	this.id = id;
	this.name = name;
}

}
