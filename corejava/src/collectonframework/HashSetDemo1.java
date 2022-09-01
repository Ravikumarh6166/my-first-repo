package collectonframework;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<Integer>();

		set.add(11);
		set.add(21);
		set.add(31);
		set.add(41);
		set.add(91);
		set.add(56);

		System.out.println("The first set elements are="+set);

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(20);
		list.add(91);
		list.add(41);
		System.out.println("new elements of set=" + list);
		
		// it will return common value from two sets
		set.retainAll(list);
		System.out.println("Data after retaining new data elements="+set);
	}

}
