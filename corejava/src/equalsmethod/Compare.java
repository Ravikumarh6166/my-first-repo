package equalsmethod;

public class Compare {

	public static void main(String[] args) {
		 Myclass obj1=new  Myclass(20);
		 Myclass obj2=new  Myclass(20);
		 
		    Integer obj3=new Integer(15);
			Integer obj4=new Integer(15);
		 
		 if(obj1.equals(obj2)) {
			 System.out.println("The objects of 1 and 2 are same");
		 }
		 else
			 System.out.println("The objects of 1 and 2 are not same");
	
         if(obj3.equals(obj4)) {
        	 System.out.println("The objects of 3 and 4 are same");
	}
         else
        	 System.out.println("The objects of 3 and 4 are not same");

}
}