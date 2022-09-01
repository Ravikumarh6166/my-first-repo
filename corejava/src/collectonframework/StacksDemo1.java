package collectonframework;

import java.util.Stack;

public class StacksDemo1 {

	public static void main(String[] args) {

		Stack<String> stk = new Stack<String>();

		stk.push("Ramachari");
		stk.push("Charulata");
		stk.push("Chandana");
		stk.push("Ravi");

		System.out.println(stk.empty());
		System.out.println("The stack Elements are=" + stk);

        //Elements is returned but not deleted
		System.out.println("Elements is returned but not deleted=" + stk.peek());

		System.out.println("The stack Elements are=" + stk);
		 System.out.println("The searched element from stack="+stk.search("Ravi "));
	}

}
