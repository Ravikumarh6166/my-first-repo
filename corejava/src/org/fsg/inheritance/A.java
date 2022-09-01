package org.fsg.inheritance;

public class A {
 float Pi=3.14f;
 int R=5;
 int t=10;
 
}

class B extends A{
	
	void areaofcircle() {
		float areaofcircle=Pi*R*R;
		System.out.println("area of circle="+areaofcircle);
	}
}

class C extends A{
	public void simpleInterest(int p) {
	float simpleInterest=p*t*R/100;
	System.out.println("simpleInterest="+simpleInterest);
	}
}

