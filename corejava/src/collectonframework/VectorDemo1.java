package collectonframework;

import java.util.*;

public class VectorDemo1 {

	public static void main(String[] args) {
		
		// Initial size 0, initial capacity 4 and increment is 3 
Vector v=new Vector(4,2);

System.out.println("initial size="+v.size());
System.out.println("intial capacity is="+v.capacity());

v.addElement(1);
v.addElement(2);
v.addElement(3);
v.addElement(4);
v.addElement(5);

System.out.println("Capacity after four addition="+v.capacity());
System.out.println("Elements by legacy method="+v);

Vector<String>vec=new Vector<String>();
vec.add("Ramachari");
vec.add("Charulath");
vec.add("Anita");

System.out.println("Elements by list method="+vec);


	}

}
