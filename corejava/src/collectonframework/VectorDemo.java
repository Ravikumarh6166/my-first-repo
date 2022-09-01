package collectonframework;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> vec = new Vector<String>();
		
        // Adding the elements using add() method of list
		
		vec.add("Lion");
		vec.add("Tiger");
		vec.add("Black panther");
		vec.add("Elephant");

		// Adding the elements using addElement() method of vector

		vec.addElement("Dog");
		vec.addElement("Cat");
		vec.addElement("Rabbit");

		/*for (int i = 0; i < vec.size(); i++) {
			System.out.println(vec.get(i));
		}*/
		
		System.out.println("Elements are=" + vec);
	}

}
