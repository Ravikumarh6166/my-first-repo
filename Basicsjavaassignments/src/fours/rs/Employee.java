package fours.rs;

public class Employee {
public static void main(String[] args) {
	EmployeeDetails emp=new EmployeeDetails();
	
	emp.setEmpid(11);
	emp.setName("xyz");
	emp.setDepartment("IT");
	emp.setAddress("abc");
	emp.setSalary(1000);
	emp.setEmail("pqr@gmail.com");
	
	System.out.println(emp);
}
}
