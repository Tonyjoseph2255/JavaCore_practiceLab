package org.ust.mylearning;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		Random t = new Random();
		for( c=1;c<=10;c++) {
			System.out.println(t.nextInt(100));
		}
	}

}
