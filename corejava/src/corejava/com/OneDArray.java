package corejava.com;

public class OneDArray {
public static void main(String[] args) {
	//int a[]=new int[5];
	int a[]= {100,200,300,400,500};
	//a[0]=10;
	//a[1]=20;
	//a[2]=30;
//	a[3]=40;
	//a[4]=50;
	//System.out.println(a[1]);
	
	int sum=0;
	
	/*for(int i=0; i<=a.length-1;i++)
	{
		System.out.println(a[i]);
		sum=sum+i;
	}
       System.out.println(sum);*/
	
	
	
	// for each loop
	for(int i:a) {
		System.out.println(i);
		sum=sum+i;
	}
	System.out.println(sum);
}
}
