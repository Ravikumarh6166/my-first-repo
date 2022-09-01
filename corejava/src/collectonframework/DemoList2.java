package collectonframework;

import java.util.*;

public class DemoList2 {

	public static void main(String[] args) {

		List<String> cars = new ArrayList<String>();

		cars.add("Ford");
		cars.add("Bmw");
		cars.add("Mazda");
		cars.add("Volvo");
		
		// for sorting 
		
		Collections.sort(cars); // this method will arrange series or alphabetical
		
		
		/* using for each loop
		 
		for(String car:cars) {
			System.out.println(car);
		}*/
		
		cars.set(2, "Audi");
		

		int len = cars.size();
		for (int i = 0; i<len; i++) {
			System.out.println(cars.get(i));
		}
	}

}
