package collectonframework;
import java.util.*;
public class QequeDemo1 {

	public static void main(String[] args) {
		
PriorityQueue<String> pq=new PriorityQueue<String>();

pq.add("pune");
pq.add("dehli");
pq.add("mumbai");
pq.add("bangaloru");

Iterator itr=pq.iterator();

while(itr.hasNext()) {
	System.out.println(itr.next());
}

 
	}

}
