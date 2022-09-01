package org.fsg.abstraction;

public class Dog extends Animal {
	public void makesound() {
		System.out.println("Dog can make a sound like bow bow");
	}
	/*public void eat() {
		System.out.println("Dog eat chapati");
	}*/

}

class Cat extends Animal{
	public void makesound() {
		System.out.println("cat can make a sound like mew mew");
	}
	/*public void eat() {
		System.out.println("cat drunk a milk");
	}*/
}