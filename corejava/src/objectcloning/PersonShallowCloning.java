package objectcloning;

public class PersonShallowCloning {
public static void main(String[] args) throws CloneNotSupportedException {
	
	Person p1=new Person();
	System.out.println("original object");
	System.out.println(p1);
	System.out.println(p1.address);
	System.out.println();
	Person p2=p1.clone();
	System.out.println("cloning object");
	System.out.println(p2);
	System.out.println(p2.address);
	
	if(p1.address==p2.address) {
		System.out.println("Shallow Cloning process");
	}
	else
		System.out.println("Deep cloning process");
}
}
