package hashMap;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<String, Integer>();

		map.put("Ravi", 101);

		map.put("rutuja", 102);
		map.put("rooja", 103);
		map.put("ramachari", 105);
		map.put("charulata", 104);
		System.out.println(map);
		System.out.println(map.entrySet());
	}

}
