package hashMap;

import java.util.*;

public class HashDemo1 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		map.put("Ravi", 101);
		map.put("ramachari", 105);
		map.put("rooja", 103);
		map.put("rutuja", 102);
		map.put("charulata", 104);

		System.out.println(map);
		System.out.println();

		for (String x : map.keySet()) {
			System.out.println("Key=" + x);
			System.out.println("value=" +map.get(x));
			System.out.println();
		}
		
	/*for(int x:map.values()) {
			System.out.println("value="+x);
		}*/
          /*for(Map.Entry<String, Integer> entry:map.entrySet()) {
        	  System.out.println(entry);*/
		System.out.println(map.get("rooja"));
          }
	
	}


