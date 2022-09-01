package assignment2;

public class Item {
String name;
double price;
int quantity;
public Item(String name, double price, int quantity) {
	//super();
	this.name = name;
	this.price = price;
	this.quantity = quantity;
	
	
}
 public String getname() {
	return name;
	 
 }
 public double getprice() {
		return price;
		 
	 }
 public int getquantity() {
		return quantity;
		 
	 }
 public double getvalue() {
		return price*quantity;
}

}
