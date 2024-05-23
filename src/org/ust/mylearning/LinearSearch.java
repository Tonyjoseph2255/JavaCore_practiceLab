package org.ust.mylearning;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, array[], c,search;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		array = new int[n];
		System.out.println("enter" + n + "element");
		for (c = 0; c < n; c++) {
			array[c] = scanner.nextInt();}
		System.out.println("enter the element to find ");
		 
		search = scanner.nextInt();
		
		for (c = 0; c < n; c++) {
			if (array[c] == search) {
				System.out.println(search + "entered element is present at" + c + 1);
				break;
				
			}

		}if (c == n) /* Searching element is absent */
			System.out.println(search + " is not present in array.");
		

	}

}
