package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparableApp {

	public static void main(String[] args) {
		
ArrayList<EmployeeComparable> EmployeeComparable=new ArrayList<>();

EmployeeComparable.add(new EmployeeComparable(35, "pune"));
EmployeeComparable.add(new EmployeeComparable(23, "mysore"));
EmployeeComparable.add(new EmployeeComparable(30, "hyderbad"));

System.out.println("Before sorting"+EmployeeComparable);

Collections.sort(EmployeeComparable);
System.out.println();
System.out.println("After sorting"+EmployeeComparable);
	}

}
