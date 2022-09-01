package corejava.com;

public class MultiDaray {

	public static void main(String[] args) {
//int a[][]=new int[2][2];
int a[][]={{100,200},{300,400}};
//a[0][0]=100;
//a[0][1]=200;
//a[1][0]=300;
//a[1][1]=400;
for(int i=0;i<a.length;i++) 
{
for(int j=0;j<a[i].length;j++)
{
	System.out.println(a[i][j]);
}
}
/*for(r[]:a)
{
	for(i:r) {
		System.out.println(i);
	}
}*/
	}

}
