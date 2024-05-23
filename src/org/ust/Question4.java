package org.ust;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(checkNumber(134468));

	}

	private static boolean checkNumber(int i) {
		String number=Integer.toString(i);
		for(int n=1;n<number.length();n++) {
			int currentDigit = number.charAt(n) - '0';
			System.out.println(currentDigit);
			int previousDigit = number.charAt(n - 1) - '0';
			if(currentDigit<previousDigit) {
				return false;
				
			}
			
		}
		return true;
		
	}

}
