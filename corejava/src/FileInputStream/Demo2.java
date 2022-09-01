package FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("D:\\RAVI\\abc.txt");
		
		System.out.println(fin.available());
		int x;
		while((x=fin.read())!=-1){
			System.out.print((char)x);
		}
	}

}
