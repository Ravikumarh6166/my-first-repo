package FileInputStream;
// code to all characters from file
import java.io.*;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("D:\\RAVI\\corejava\\src\\corejava"
				+ "\\com\\star.java");
		int x;
		while((x=fin.read())!=-1){
			System.out.print((char)x);
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
				
			}
		}
	}

}
