package week2;

public class ThisKeyword {
int a,b;
  
void getvalues(int a, int b)
{
	this.a=a;
	this.b=b;
}
void display() {
	System.out.println(a+b);
}

public static void main(String[] args) {
	ThisKeyword ThisKeyword =new ThisKeyword ();
	ThisKeyword.getvalues(96, 65);
	ThisKeyword.display();
}



}
