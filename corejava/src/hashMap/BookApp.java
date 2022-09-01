package hashMap;

import java.util.HashMap;
import java.util.Map;

import collectonframework.Book;

public class BookApp {

	public static void main(String[] args) {

		Map<Integer, Book> map = new HashMap<Integer, Book>();

		Book b1 = new Book(11, "Let us C", "Yashwant Kantekar", "BPB", 8);
		Book b2 = new Book(12, "Data Communication & Networking", "Forouzan", "Mc graw hill", 4);
		Book b3 = new Book(13, "opertating system", "Galvin", "Wile", 6);

		map.put(1, b3);
		map.put(2, b2);
		map.put(3, b1);

		for (Integer x : map.keySet()) {
			System.out.println("Key Details:" + x);
			Book b = map.get(x);
			System.out.println("book id=" + b.id + " " + "book name=" + b.name + " " 
			+ " book author=" + b.author + " "+ "book publisher=" + b.publisher 
			+ " " + " book quantity=" + b.quantity);
					
		}
	}

}
