package org.fsg.inheritance;

public class Commercial {
	
 private String custName;

public String getCustName() {
	return custName;
}

public void setCustName(String custName) {
	this.custName = custName;
}
 public void CalBillunits(int units) {
	 
	 System.out.println("customername="+custName);
	 System.out.println("Bill Amount="+units*4);
	 
 }
}

 class Domestic extends Commercial{
	 
	 public void CalBillunits(int units) {
		 System.out.println("customername="+getCustName());
		 System.out.println("Bill Amount="+units*3.5);
		 
	 }
 }