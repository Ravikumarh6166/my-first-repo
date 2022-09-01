package collectonframework;

import java.util.*;

public class DequeDemo {

	public static void main(String[] args) {

		ArrayDeque<String> ad = new ArrayDeque<String>();

		ad.add("pune");
		ad.add("dehli");
		ad.add("mumbai");
		ad.add("bangaloru");

		System.out.println(ad);

		ArrayDeque<String> ad1 = new ArrayDeque<String>();

        //it will add first of container

		ad1.addFirst("pune");
		ad1.addFirst("dehli");
		ad1.addFirst("mumbai");
		ad1.addFirst("bangaloru");

		System.out.println(ad1);
	}

}
