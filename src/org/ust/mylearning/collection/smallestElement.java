package org.ust.mylearning.collection;

import java.util.Arrays;

public class smallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input= {10, 20, 30, 10, -10, 30, 45, 56, 7, 8, 90, 123};
		int nthSmallest=2;
		int result= getNthSmallestNumber ( input,  nthSmallest);
		System.out.println(input[nthSmallest-1]);
	}

	private static int getNthSmallestNumber(int[] input, int nthSmallest) {
		// TODO Auto-generated method stub
		
		Arrays.sort(input);
		 //return input[nthSmallest-1];
		//System.out.println(input[nthSmallest-1]);
		for(int ya:input) {
	System.out.println(ya);
		
		
		
	}

		return input[nthSmallest-1];
	}

	

}
