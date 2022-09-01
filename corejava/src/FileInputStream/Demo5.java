package FileInputStream;

import java.io.*;

public class Demo5 {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("D:\\RAVI\\xyz.txt");
		fw.write("Java Technology");
		fw.close();
		System.out.println("Data written successfully");
	}

}
