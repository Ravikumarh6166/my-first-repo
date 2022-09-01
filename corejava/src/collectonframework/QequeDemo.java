package collectonframework;

import java.util.PriorityQueue;

public class QequeDemo {

	public static void main(String[] args) {
PriorityQueue<String> pq=new PriorityQueue<String>();

pq.add("Orange");
pq.add("Apple");
pq.add("Graphes");
pq.add("Mango");

System.out.println("Queue Elements are="+pq);
System.out.println("Queue peeked Elements are="+pq.peek());
System.out.println("Queue removed Elements are="+pq.remove());
System.out.println("Queue Elements are="+pq);
	}

}
