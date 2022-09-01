package assignment2;

public class ItemApp {

	public static void main(String[] args) {
		
  Item Item1=new Item("Orange", 2.25, 15);
  Item Item2=new Item("Grapes", 3.25, 25);
  Item Item3=new Item("Butter", 4.25, 35);
  
  String header="Name"+"\t"+"value" +"\t"+"price"+"\t"+"quantity" ;
  int lenheader=header.length();
  System.out.println(header);
  
  int count=0;
  while(count<lenheader) {
	  System.out.print("==");
	  count+=1;
	
	  
  }
  System.out.println("");
  
  System.out.println(Item1.getname()+"\t"+Item1.getvalue()
		  +"\t"+Item1.getprice()+"\t"+Item1.getquantity());
  
  System.out.println(Item2.getname()+"\t"+Item2.getvalue()
		  +"\t"+Item2.getprice()+"\t"+Item2.getquantity());
  
  System.out.println(Item3.getname()+"\t"+Item3.getvalue()
		  +"\t"+Item3.getprice()+"\t"+Item3.getquantity());
	  
	}

}
