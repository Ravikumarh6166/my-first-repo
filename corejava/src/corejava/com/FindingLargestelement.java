package corejava.com;

public class FindingLargestelement {
public static void main(String[] args) {
	int a[]= {10,50,45,36};
	int max=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>max)
		max=a[i];
	}
	System.out.println("largest element is:" +max);
}
}
