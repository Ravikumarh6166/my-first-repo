package collectonframework;

import java.util.*;

public class Descending {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		
		list.add("pune");
		list.add("Bangalore");
		list.add("Belgaum");
		list.add("Mumbai");

		Iterator itr = list.descendingIterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
