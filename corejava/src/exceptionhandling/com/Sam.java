package exceptionhandling.com;

// throwing the NullPointerException

public class Sam {

	static void demo() {
		
		try 
		{
			System.out.println("inside demo()");
		throw new NullPointerException("Exception data");
		}
		catch (NullPointerException ne) 
		{
			System.out.println(ne);
		}
	}
}
