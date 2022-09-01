package FileInputStream;
// code to read characters from file
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("D:\\RAVI\\abc.txt");
		int x = fin.read(); // it will return Acsii value  of starting word of file
		System.out.println(x);
		System.out.println((char)x); // typecasting its convert int to char
	}

}
