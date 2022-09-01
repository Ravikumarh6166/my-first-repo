package corejava.com;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many string?");
		int n =Integer.parseInt(scan.nextLine());
		 String str[]=new String[n];
		 for(int i=0;i<n;i++)
		 {
			 System.out.print("Enter a string:");
				str[i]=scan.nextLine();
		 }
			System.out.print("Enter string to search:");
			String search=scan.nextLine();
			boolean found=false;
			for(int i=0;i<n;i++) {
				if(search.equalsIgnoreCase(str[i]))
				{
					System.out.println("Found at position:"+(i+1));
					found=true;
				}
			}
			if(!found) {
				System.out.println("Not found in the group");
			}
			
	}
}
