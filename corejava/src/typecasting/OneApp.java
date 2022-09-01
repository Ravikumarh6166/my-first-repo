package typecasting;

public class OneApp {

	public static void main(String[] args) {
     Two two=new Two();
     two.Show1(10, 20);
     two.show2();
		
		
		/* super class reference to refer to sub class object.

		One obj=new Two();
		obj.Show1(10, 20);
		// obj.show2();  it shows compile time error
		((Two)obj).show2();*/
		
	}

}
