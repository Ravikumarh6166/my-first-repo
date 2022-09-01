package week2;

import java.util.Scanner;

public class Assignment1Que3 {
public static void main(String[] args) {
	int StartingTimehrs;
	int StartingTimemin;
	int Duration;
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the staring Time(in hrs)");
	StartingTimehrs=scan.nextInt();
	System.out.println("Enter the Starting Time(in minutes)");
	StartingTimemin=scan.nextInt();
	  System.out.println("Enter the duration in minutes");
	Duration=scan.nextInt();
	
	int endingtime=60*(StartingTimehrs)+StartingTimemin+Duration;
	
	int endinghrs=endingtime/60;
	int endingmins=endingtime%60;
	
	  System.out.println("Ending hour is:"+endinghrs+" Ending min is:"+endingmins);
	   //System.out.println("Ending min is:"+endingmins);

}
}
