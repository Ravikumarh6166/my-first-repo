package collectionFrameworkAssignment.com;

import java.util.*;

public class ArrayListAscending {

	public static void main(String[] args) {
		
ArrayList<Integer> al=new ArrayList<Integer>();

al.add(1);
al.add(2);
al.add(2);
al.add(3);
al.add(6);
al.add(8);
al.add(8);
al.add(9);

// to sorting
Collections.sort(al);
System.out.println("Before sorting+"+al);
System.out.println("After sorting="+al);

// convert the array list into a set
Set<Integer> set = new LinkedHashSet<>();

set.addAll(al);

//clear all elements of array list
al.clear();

//add element from set to array list
al.addAll(set);
System.out.println("ArrayList without duplicate elements: " + al);


	}

}
