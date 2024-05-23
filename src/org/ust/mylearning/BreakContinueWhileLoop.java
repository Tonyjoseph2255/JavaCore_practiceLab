package org.ust.mylearning;

import java.util.Scanner;

public class BreakContinueWhileLoop {
	public static void name(String []args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("input an integer");
			n=scanner.nextInt();
			if(n!=0) {
				System.out.println("You entered " + n);
				 continue;
				 }
				 else {
				 break;
				 }
			}
		}
				
		
	

}
