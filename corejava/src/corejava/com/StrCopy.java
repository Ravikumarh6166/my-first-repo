package corejava.com;

public class StrCopy {
public static void main(String[] args) {
	String str="Hello where are you from";
	char arr[]=new char[20];
	str.getChars(7,20,arr,0);
	System.out.println(arr);
}
}
