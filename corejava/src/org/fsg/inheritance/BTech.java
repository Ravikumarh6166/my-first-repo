package org.fsg.inheritance;

 class BTech extends Student {
 public void degree() {
	System.out.println(" Degree is Engineering");
}
}

class Ec extends BTech{
	void stream() {
		System.out.println(" stream is Ec");
	}
}

class Iot extends Ec{
	void domain() {
		System.out.println(" Domain is IOt");
	}
}
