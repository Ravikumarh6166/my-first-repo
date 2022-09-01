package objectcloning;

public class BoxApp {

	public static void main(String[] args) throws CloneNotSupportedException {
     Box b=new Box();
     System.out.println("Displying from Original Object");
     b.setValue(7);
     System.out.println(b.getValue());
     
     System.out.println("Displying from cloning Object");
     Box b1=b.clone(); 
     System.out.println(b1.getValue());
	}

}
