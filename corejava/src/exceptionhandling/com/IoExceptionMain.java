package exceptionhandling.com;

import java.io.IOException;

public class IoExceptionMain {
public static void main(String[] args) throws IOException {
	IoException IoException=new IoException();
	IoException.accept();
	IoException.display();
}
}
