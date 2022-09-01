package org.fsg.inheritance;

public class PrincipalApp {

	public static void main(String[] args) {

		Principal princ=new Principal();
		princ.car();
		princ.printId(101);
		princ.printName("sssss");
		
		Teacher tech=new Teacher();
		tech.car();
		tech.printId(102);
		tech.printName("rrrrr");
		
		Clark cl=new Clark();
		cl.bike();
		cl.printId(202201);
		cl.printName("ttttt");
	}

}
