package org.fsg.inheritance;

public class Principal extends Person {

	public void car() {
		
		System.out.println("Principle have a white color car");
		System.out.print("principal's car");
	}

}


class Teacher extends Person{
	
	public void car() {
		System.out.println("Teacher have a red color of i20 car");
		System.out.print("Teacher's car");
	}
}

class Clark extends Person{
	public void bike() {
		System.out.println("Student have a Bike");
		System.out.print("Studets's");
	}
}