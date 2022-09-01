package week2;

public class Employee {
  
	int empid;
	String empname;
	double empsal;
	String empjob;
	
	void display()
	{
		System.out.println("empid="+empid);
		System.out.println("empname="+empname);
		System.out.println("empsal="+empsal);
		System.out.println("empjob="+empjob);
	}
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.empid=501;
		emp1.empsal=5000;
		emp1.empname="thomas";
		emp1.empjob="tech supports";
		emp1.display();
		
		System.out.println();
		
		Employee emp2=new Employee();
		emp1.empid=502;
		emp1.empsal=5000;
		emp1.empname="Jhonthomas";
		emp1.empjob="Lead supports";
		emp1.display();
		System.out.println();
		
		
		Employee emp3=new Employee();
		emp1.empid=503;
		emp1.empsal=5000;
		emp1.empname="Jhon";
		emp1.empjob="Backend supports";
		emp1.display();
		
	}
}
