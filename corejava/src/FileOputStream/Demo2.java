package FileOputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("D:\\RAVI\\testout.txt");
		fos.write(66);
		fos.close();
		System.out.println(" Data written successfully");
	}

}
