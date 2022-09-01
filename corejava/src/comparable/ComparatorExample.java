package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.setAge(35);
		p1.setName("Raju");

		Person p2 = new Person();
		p2.setAge(40);
		p2.setName("Kiran");

		Person p3 = new Person();
		p3.setAge(20);
		p3.setName("Suresh");

		ArrayList<Person> per = new ArrayList<>();
		per.add(p1);
		per.add(p2);
		per.add(p3);

		Collections.sort(per, new AgeComparator());

		for (Object obj : per) {
			Person p = (Person) obj;

			System.out.println("PersonName= " + p.getName() + " Personage= " + p.getAge());
		}

	}

}
