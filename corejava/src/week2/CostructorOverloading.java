package week2;

public class CostructorOverloading {

	CostructorOverloading(int b, int c, String m) {
    System.out.println(b+c+m);

	}
	
	CostructorOverloading(int b,double c, String m) {
	    System.out.println(b+c+m);

		}
	CostructorOverloading(double b, int c, String m) {
	    System.out.println(b+c+m);

		}

	public static void main(String[] args) {
		CostructorOverloading costructorOverloading=new CostructorOverloading(34,55.5,"raj");
		
		
	}

}
