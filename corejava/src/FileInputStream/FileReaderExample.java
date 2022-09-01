package FileInputStream;


import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		FileReader fin = new FileReader("D:\\RAVI\\abc.txt");

		int x;
		while ((x = fin.read()) != -1) {
			System.out.print((char) x);
		}
	}

}
