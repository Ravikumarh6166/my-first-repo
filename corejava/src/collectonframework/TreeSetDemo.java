package collectonframework;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> al = new TreeSet<String>();

		al.add("Ravi");
		al.add("Mahesh");
		al.add("Vijay");
		al.add("Rakesh");

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
