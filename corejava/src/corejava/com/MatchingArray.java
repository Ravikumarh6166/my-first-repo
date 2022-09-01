package corejava.com;

public class MatchingArray {
public static void main(String[] args) {
	int m=1;
	int n=0;
	int a[][]= {{1,2,3},{4,5,6},{7,8,10}};
	int b[][]= {{1,20,3},{40,5,60},{7,80,90}};
	
	for(int i=0; i<a.length;i++)
	{
		for(int j=0;j<b.length;j++) {
			if(a[i][j]==b[i][j]) {
				System.out.print(m+"");
			}
			else {
				System.out.print(n+"");
			}
		}
		System.out.println();
		
	}
	System.out.println();
}
}
