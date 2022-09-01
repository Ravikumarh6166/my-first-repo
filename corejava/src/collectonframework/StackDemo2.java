package collectonframework;

import java.util.*;

public class StackDemo2 {
	public static void main(String[] args) {

		Stack<Integer> stk = new Stack<Integer>();
		stk.push(11);
		stk.push(12);
		stk.push(13);
		stk.push(14);

		System.out.println("The satck elements are =" + stk);
		// it will helps for to find the element position in reverse index order
		System.out.println("The searched element from stack=" + stk.search(11));

	}
}
