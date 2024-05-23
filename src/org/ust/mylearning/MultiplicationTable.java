package org.ust.mylearning;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ,c;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		for(c=1;c<=10;c++) {
			System.out.println("multiplication"+n+"*"+c +"="+(n*c));
		}
				
		

	}

}
