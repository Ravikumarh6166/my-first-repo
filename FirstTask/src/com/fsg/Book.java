package com.fsg;

public class Book {
private String name;
private String author;
private double cost;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}

public void display() {
System.out.println("Book Details[Bookname="+name+", Bookauthor="+author+", Bookcost= "+cost+"]");
}


}
