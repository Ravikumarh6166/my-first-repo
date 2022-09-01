package week2;

public class Calculation {

	int x=100;
	int y=200;
	
	/*void sum() // case 1: method not taking the parameters and not return the values
	{
		System.out.println(x+y);
	}*/
	
	/*int sum() // case 2: method  not taking the parameters and return the values
	{
		return (x+y);
	}*/
	
	/*void sum(int a, int b) // case 3:method  taking the parameters and not return the values
	{
	 System.out.println(a+b);
	}*/
	
	int sum(int a,int b) // case 4: method snot taking the parameters and return the values
	{
		return (a+b);
	}
	
	
	
	public static void main(String[] args) {
		Calculation cal=new Calculation();
		//cal.sum(); case1
		
		//	int res=cal.sum();  case2
		//	System.out.println(res);
	//	System.out.println(cal.sum());
		
		//cal.sum(500,600);  case3
		
System.out.println(cal.sum(500,600));  //case4
		
		
	}

}
