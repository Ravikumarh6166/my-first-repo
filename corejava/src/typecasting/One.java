package typecasting;
// super class is referring to sub class
public class One {
	
  public void Show1(int a ,int b) {
	  System.out.println(a+b);
	  System.out.println("its super class");
  }
	
}
 class Two extends One{
	 
	public void show2() {
		System.out.println("its sub class");
	}
 }