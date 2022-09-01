package org.fsg.inheritance;

public class StudentApp {
public static void main(String[] args) {
	BTech bt=new BTech();
	bt.display();
	bt.degree();
	
	Ec ec=new Ec();
	ec.display();
	ec.stream();
	
	Iot iot=new Iot();
	iot.display();
	iot.domain();
}
}
