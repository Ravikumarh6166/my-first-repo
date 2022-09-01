package com.io.deserializable;

import java.io.Serializable;

public class Teacher implements Serializable {
int id;
String name;
static String SchoolName="SSMS";

public Teacher(int id, String name) {
	
	this.id = id;
	this.name = name;
}

}
