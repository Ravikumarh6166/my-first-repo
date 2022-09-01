
//Write a program to accept an integer number from keyboard 
//and convert it into other number systems.

package wrapperclass;

import java.io.*;

public class Convert {

	public static void main(String[] args) throws IOException {
		BufferedReader   br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer: ");
		String   str=br.readLine();
		
		//convert string into int
		
		int   i=Integer.parseInt(str);
		System.out.println("In decimal:"+i);
		
		str=Integer.toBinaryString(i);
		System.out.println("In Binary: "+str);

		str=Integer.toHexString(i);
		System.out.println("In hexadecimal: "+str);

		str=Integer.toOctalString(i);
		System.out.println("In Octal: "+str);
	}

}
