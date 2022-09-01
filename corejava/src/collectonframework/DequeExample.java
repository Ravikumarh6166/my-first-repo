package collectonframework;

import java.util.*;

public class DequeExample {

	public static void main(String[] args) {

		Deque<String> deque=new ArrayDeque<String>();
		
		deque.offerFirst("Kgf2");
		deque.add("vk");
		deque.offer("Kranti");
		deque.offer("james");
		
		System.out.println("After offerFirst Traversal");
		
		for(String s:deque) {
			System.out.println(s);
		}
		deque.pollLast();
		System.out.println("After pollLast Traversal");
		for(String s:deque) {
			System.out.println(s);
		}
		
		
	}

}
