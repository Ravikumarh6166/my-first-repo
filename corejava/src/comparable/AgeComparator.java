package comparable;

import java.util.Comparator;

public class AgeComparator implements Comparator {

	@Override
	public int compare(Object person1, Object person2) {

		int ob1Age = ((Person) person1).getAge();
		int ob2Age = ((Person) person2).getAge();

		if (ob1Age > ob2Age)
			return 1;
		else if (ob1Age < ob2Age)
			return -1;
		else

			return 0;
	}

}
