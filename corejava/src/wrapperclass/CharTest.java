package wrapperclass;

import java.io.*;

public class CharTest {

	public static void main(String[] args) throws IOException {
    char ch = 0;
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    while(true){
    	System.out.print("Enter a character:");
    	ch= (char) br.read();
    	System.out.print("You entered:");
    	if(Character.isDigit(ch)) {
    		System.out.println("a digit");
    	}
    	else if(Character.isLowerCase(ch))
    	{
    	System.out.println(" An LowerCase letter");
    	}
    else if(Character.isUpperCase(ch))
    	{
    System.out.println("An UpperCase letter");
    	}
    else if(Character.isSpaceChar(ch)) {
    	System.out.println("A Spacebar");
    }
    else if(Character.isWhitespace(ch))	{
    	System.out.println("A white Spacebar");
    	//return;
    	
    }
	else		
		System.out.println("Sorry, I dont know that");
    	br.skip(2);
	}
	}
}


