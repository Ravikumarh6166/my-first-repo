package wrapperclass;

public class Demo1 {
public static void main(String[] args) {
	// AutoBoxing
	int a=100;
	Integer b=a;
	System.out.println("AutoBoxing value:"+b);
	
	//Boxing
	int x=90;
	Integer y=Integer.valueOf(x);
	System.out.println("Boxing Value:"+y);
	
	//UnBoxing
	Integer result=80;
	int newResult=result.intValue();
	System.out.println("UnBoxing Value"+newResult);
	
	// AutoUnBoxing
	
	int marks=45;
	Integer newMarks=marks;
	System.out.println("AutoUnBoxing value"+marks);

}
}
