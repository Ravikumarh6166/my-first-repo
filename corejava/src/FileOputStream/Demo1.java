package FileOputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		
     FileOutputStream fos= new FileOutputStream("D:\\RAVI\\pqr.txt");
     
     String msg="Student life is golden life dont waste a time in school life and "
     		+ "lets enjoy";
     
     byte[] data=msg.getBytes(); // converting string into byte
     fos.write(data);
     
    // fos.write(data,15,25);// its written from to given length
     fos.close();
     System.out.println("Data written sucess");
     
	}

}
