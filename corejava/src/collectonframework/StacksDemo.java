package collectonframework;

import java.util.*;

public class StacksDemo {

	public static void main(String[] args) {

		Stack<Integer> stk = new Stack<Integer>();

		System.out.println(stk.empty());// this method to check the stack empty or not

        // adding the elements into stack
		stk.push(11);
		stk.push(12);
		stk.push(13);
		stk.push(14);

		System.out.println(stk.empty());

		System.out.println("Stack elements =" + stk);

        // to removing the elements from stack
		System.out.println("The removed element from stack=" + stk.pop());
		System.out.println("The removed element from stack=" + stk.pop());
		System.out.println("Stack elements =" + stk);
	}

}
