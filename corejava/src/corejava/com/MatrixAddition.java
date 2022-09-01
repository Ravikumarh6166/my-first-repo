package corejava.com;

public class MatrixAddition {
public static void main(String[] args) {
	int a[][]= {{1,2,1},{3,4,5},{4,2,5}};
	int b[][]= {{5,6,1},{7,8,5},{0,-2,8}};
	int c[][]=new int[3][3];
	
	
	for(int i=0;i<3;i++){   
		
		
		for(int j=0;j<3;j++){    
			
			
		c[i][j]=a[i][j]+b[i][j];  
		
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();
		}    
		}
}
