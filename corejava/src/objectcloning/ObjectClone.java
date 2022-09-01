package objectcloning;

import java.util.Scanner;

public class ObjectClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the EmployeeName");
		String name = scan.nextLine();
		System.out.println("Enter the EmployeeId");
		String id = scan.nextLine();
		
		Employee obj1 = new Employee(name, id);
		System.out.println("Displying from Original Object");
		System.out.println(obj1);
		Employee obj2 = obj1.clone();
		System.out.println("Displying from clone object");
		System.out.println(obj2);
		scan.close();

	}
}
