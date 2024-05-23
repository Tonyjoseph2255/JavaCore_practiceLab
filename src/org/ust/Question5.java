package org.ust;

public class Question5 {
	public static void main(String[] args) {
		System.out.println(checkNumber(8));
	
		

	}

	private static boolean checkNumber(int i) {
		if(i<=0) {
			return false;
		}
		return (i&(i-1))==0;
		
	}

}
