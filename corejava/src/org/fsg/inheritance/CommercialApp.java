package org.fsg.inheritance;

public class CommercialApp {
public static void main(String[] args) {
	Domestic dome=new Domestic();
	dome.setCustName("ramachari");
	dome.CalBillunits(50);
	
	Commercial comm=new Commercial();
	comm.setCustName("charulata");
	comm.CalBillunits(50);
	
}
}
