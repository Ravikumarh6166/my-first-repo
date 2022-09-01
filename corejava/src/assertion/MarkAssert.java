package assertion;

public class MarkAssert {
 static float Maxmarks=100;
 static float changes(float mark) {
	 Maxmarks=Maxmarks-mark;
	 System.out.println("The Maximum Scored marks is="+Maxmarks);
	return mark;
	 
 }
 public static void main(String[] args) {
	float g;
	for(int i=0;i<5;i++) {
		g=changes(15);
		assert Maxmarks>=35:"marks is below 35.";
	}
}
}
