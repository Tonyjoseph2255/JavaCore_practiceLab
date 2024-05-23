package org.ust.mylearning.collection;

import java.util.HashMap;

public class Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input1 = { 10, -2, -3, 3, 5 };
		int sum=0
				;
				printPairsTogether (input1, sum);


	}

	private static void printPairsTogether(int[] input1, int sum) {
		// TODO Auto-generated method stub
		 HashMap<Integer, Integer>hashMap= new HashMap<>();
		 for(int i= 0;i<input1.length;i++) {
			 int complement= sum-input1[i];
			 if(hashMap.containsKey(complement)) {
				 System.out.println("pair "+input1[hashMap.get(complement)]+ input1[i]);
			 }
			 hashMap.put(input1[i], i);
		 }
		
	}

}
