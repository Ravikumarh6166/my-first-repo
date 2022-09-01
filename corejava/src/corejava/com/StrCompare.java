package corejava.com;

public class StrCompare {
public static void main(String[] args) {
	String s1="hello";
	String s2=new String("hello");
	if(s1==s2) {
		System.out.println("same");
	}
	else {
		System.out.println("notsame");
	}
}
}
