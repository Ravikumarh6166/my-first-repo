package exceptionhandling.com;

public class CovertingStreingToNumber {

	public static void main(String[] args) {
     try {
    	 String s="Flower";
    	 int i=Integer.parseInt(s);
    	 System.out.println("int value="+i);
     }
     catch(NumberFormatException nfe) {
    	 nfe.printStackTrace();
     }
		
	}

}
