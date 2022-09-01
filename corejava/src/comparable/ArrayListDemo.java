package comparable;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
ArrayList<Student> al=new ArrayList<Student>();

Student s= new Student(11, "sachin", 38);
Student s1= new Student(12,"yogesh", 40);
Student s2=new Student(13, "ramesh", 42);
Student s3 =new Student(14,"rajesh",44);

al.add(s);
al.add(s1);
al.add(s2);
al.add(s3);

for(Student s11:al) {
	System.out.println(s11.id+" "+s11.name+" "+s11.marks);
}
	
	}

}
