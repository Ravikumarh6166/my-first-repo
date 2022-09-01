package collectonframework;

//To reverse the string using stack framework

import java.util.*;

public class StackDemo3 {

	public static void main(String[] args) {
		
		Stack<Character> stk = new Stack<Character>();

		String str = "Java Developer";
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			stk.push(str.charAt(i));
		}
		while (!stk.empty()) {
			str1 = str1 + stk.pop();
		}
		System.out.println(str1);
	}

}
