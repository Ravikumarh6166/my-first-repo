package corejava.com;

public class MultiDimensionalarray {

public static void main(String[] args) {
 int a[][]=new int[3][4];
   
 
 a[0][0]=1;
 a[0][1]=2;
 a[0][2]=3;
 a[0][3]=4;
 
 a[1][0]=5;
 a[1][1]=6;
 a[1][2]=79;
 a[1][3]=8;
 
 a[2][0]=9;
 a[2][1]=10;
 a[2][2]=11;
 a[2][3]=15;
		
// int a[][]= {{1,2,3,4,},{5,6,79,8},{9,10,11,12},}; 
 
 
 int max=a[0][0];
int min=a[0][0];
 
 for(int i=0; i<a.length;i++)
 {
	 
	 for(int j=0; j<a[i].length; j++) {
		 System.out.print(a[i][j]+" ");
	 }
	 System.out.println();
 }
 for(int i=0; i<a.length;i++) {
	 for(int j=0; j<a[i].length; j++) {
		 if(a[i][j]>max)
			 max=a[i][j];
		 
	 }
	 
 }
 for(int i=0; i<a.length;i++) {
	 for(int j=0; j<a[i].length; j++) {
		 if(a[i][j]<min)
			 min=a[i][j];
	}

}
 System.out.println("The largest num is "+max);
 System.out.println("The smalleest num is "+min);
	}
}
