package collectonframework;

import java.util.*;

public class DemoList4 {

	public static void main(String[] args) {
		
ArrayList<String>langauge=new ArrayList<String>();

langauge.add("java");
langauge.add("python");
langauge.add("c++");
langauge.add("c#");

Collections.sort(langauge);

for(String i :langauge) {
	System.out.println(i);
}

	}

}
