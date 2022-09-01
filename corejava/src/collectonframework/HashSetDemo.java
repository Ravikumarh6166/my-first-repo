package collectonframework;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<Integer>();

		set.add(11);
		set.add(21);
		set.add(31);
		set.add(41);

		System.out.println(set);

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(51);
		list.add(61);
		list.add(71);
		list.add(81);
		
        // this will add all elements to set
		set.addAll(list);
		
		//set.remove(61);

		System.out.println("Added all elements to set=" + set);
        // its will find value present or not
		System.out.println("set contains element 31=" + set.contains(31));
		System.out.println("set contains element 36=" + set.contains(36));
		
		System.out.println("set contains list="+set.containsAll(list));
		
		System.out.println("The hashcode of set="+set.hashCode());
	}

}
