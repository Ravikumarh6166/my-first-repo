package collectonframework;

import java.util.*;

public class SortedSetTset {

	public static void main(String[] args) {
		
		SortedSet st = new TreeSet();

		st.add('a');
		st.add('f');
		st.add('e');
		st.add('d');
		st.add('c');
		st.add('b');

		Iterator itr = st.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

}
