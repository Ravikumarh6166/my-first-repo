package week2;

public class Student {

	int sid;
	String sname;
	char grade;  
	
	void getvalues(int id,String name,char g) {
		
		sid=id;
		sname=name;
		grade=g;
	}
	// using constructor
 Student(int id,String name,char g) {
		
		sid=id;
		sname=name;
		grade=g;
	}
	 
	void display()
	{
		System.out.println("sid="+sid+",sname="+sname+",grade="+grade);
	}
	
}
