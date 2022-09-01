package comparable;
//Comparable and comparator
public class EmployeeComparable implements Comparable<EmployeeComparable>  {

	int age;
	String loc;
	public EmployeeComparable(int age, String loc) {
		
		this.age = age;
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "EmployeeComparable [age=" + age + ", loc=" + loc + "]";
	}
	@Override
	public int compareTo(EmployeeComparable employeeComparable) {
		
		if(age==employeeComparable.age) {
			return 0;
		}
		else if(age>employeeComparable.age) {
		return 1;
		}
	else{
		return -1;
	}
	}
}

