package exceptionhandling.com;

public class RunTimeError {

	public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("main() method without its parameter: "
        		+ "String args[ ]. Here JVM cannot detect it and cannot execute the code.\r\n" + 
        		"");
        System.out.println("Exception in thread "
        		+ "“main”java.lang.NoSuchMethodError:  main"); // this statement will get in OP
	}

}
