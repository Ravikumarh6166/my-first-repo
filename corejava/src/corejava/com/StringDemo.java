package corejava.com;

public class StringDemo {
public static void main(String[] args) {
	String s1="A book on java";
	String s2=new String("i like it");
	char arr[]={'d','r','e','m','t','e','c','h'};
	String s3=new String(arr);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println("Length of string s2="+s2.length());
	System.out.println("s2 joined s3="+s2.concat(s3));
	String p=s2.substring(0,7);
	String q=s1.substring(0,5);
	System.out.println(p+q);
}
}
