package com.io.deserializable;

import java.io.Serializable;

public class Address implements Serializable  {
	
String city;
String Taluk;
String Dist;
String State;

public Address(String city, String taluk, String dist, String state) {

	this.city = city;
	this.Taluk = taluk;
	this.Dist = dist;
	State = state;
}


}
