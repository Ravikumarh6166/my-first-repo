package collectonframework;

import java.util.*;

public class DemoList1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);

		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
