package objectcloning;

class Address implements Cloneable {  // Deep cloning class
	
//class Address { shadowing class

	String HouseNo = "123A";
	String StreetName = "Uppal Metro";
	String city = "Hyderbad";

	public String toString() {
    return "HouseNo="+ HouseNo + "\nStreetName="+StreetName+ "\ncity="+city;

	}
	// address class clone
	public Address clone()throws CloneNotSupportedException {
		Address add = (Address) super.clone();
		return add; 
		
		
	}
}

public class Person implements Cloneable {

	String name = "Charulata";
	String id = "R123";
	
	Address address = new Address();

	public String toStrng() {
		return "name=" + name + "\nid=" + id;
	}

	public Person clone() throws CloneNotSupportedException {
		Person p = (Person) super.clone();
		p.address=this.address.clone(); // clone method of address class
		return p;

	}
}