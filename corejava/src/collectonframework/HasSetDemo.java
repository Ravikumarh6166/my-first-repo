package collectonframework;

import java.util.*;

public class HasSetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Ramachari");
		set.add("charulata");
		set.add("Chandana");
		set.add("Amulya");
		set.add("Ravikumar");
		set.add("Rajesh");
		System.out.println(set);

		System.out.println(set.removeIf(str -> str.contains("R")));
		System.out.println(set);
	}

}
