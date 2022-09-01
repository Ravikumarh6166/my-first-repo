package hashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HasMapDemo {

	public static void main(String[] args) throws Exception, IOException {

		HashMap<String, Long> hm = new HashMap<String, Long>();

		String name, str;
		long phno;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			System.out.println("1 Enter phone entries");
			System.out.println("2 Loop up in the book");
			System.out.println("3 Display Name sin book");
			System.out.println("4 Exit");

			System.out.println("Enter your choice ");
			int n = Integer.parseInt(br.readLine());

			switch (n) {
			
			case 1:
				System.out.print("Enter name: ");
				name = br.readLine();
				System.out.print("Enter phno: ");
				str = br.readLine();
				phno = new Long(str);
				// store name and phno into HashMap
				hm.put(name, phno);
				break;

			case 2:
				System.out.print("Enter name: ");
				name = br.readLine();
				name = name.trim();// remove unnecessary spaces
				// pass name and get phno
				phno = hm.get(name);
				System.out.println("Phno: " + phno);
				break;

			case 3: // use keySet() to display the anmes
				// create HashSet object to store names and refer it by set reference

				Set<String> set = new HashSet<String>();
				set = hm.keySet();
				System.out.println(hm);
				System.out.println(set);
				
				break;
				
			case 4:
				System.out.println("Exit successfully");
				return;
			}

		}
	}
}
