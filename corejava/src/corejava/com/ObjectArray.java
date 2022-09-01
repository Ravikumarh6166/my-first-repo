package corejava.com;

public class ObjectArray {
public static void main(String[] args) {
	/*Object a[]=new Object[5];
	a[0]=10;
	a[1]="welcome";
	a[2]='c';
	a[3]=10.2;
	a[4]="true";*/
	Object a[]= {10,10.2,'c',"welcome","true"};
	for(Object i:a) {
		System.out.println(i);
	}
}
}
