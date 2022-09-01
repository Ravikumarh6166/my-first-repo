package hashMap;

import java.util.*;

public class HashMapDemo1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		map.put("Ravi", 101);

		map.put("rutuja", 102);
		map.put("rooja", 103);
		map.put("ramachari", 105);
		map.put("charulata", 104);
		System.out.println(map);
	}

}
