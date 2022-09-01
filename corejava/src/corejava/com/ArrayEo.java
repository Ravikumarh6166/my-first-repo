package corejava.com;

public class ArrayEo {
public static void main(String[] args) {
	int a[]= {1,3,2,5,4,7,6,9};
	System.out.println("even numbers");
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0){
			System.out.println(a[i]);
		}
	    }

System.out.println("odd numbers");
for(int i=0;i<a.length;i++) {
	if(a[i]%2!=0) {
		System.out.println(a[i]);
	}
}
	
		
	}
}

