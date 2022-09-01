package exceptionhandling.com;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingFile {

	public static void main(String[] args) {
     
		try {
		FileInputStream fstream=new FileInputStream("D:\\RAVI\\TextFile.txt");
		 DataInputStream dis = new DataInputStream(fstream);
		 
         BufferedReader br = new BufferedReader(new InputStreamReader(dis));

         String str;

         while ((str = br.readLine()) != null) {
             System.err.println(str);
		}
	}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			 e.printStackTrace();
		 }
	}

}
