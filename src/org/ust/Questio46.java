
package org.ust;

public class Questio46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12320;
		 boolean isPalindrome	=checkPalindrome(number);
		 System.out.println("Is " + number + " a palindrome? " + isPalindrome);
	}

	private static boolean checkPalindrome(int number) {
		// TODO Auto-generated method stub
		String numberStr=String.valueOf(number);
		StringBuilder stringBuilder= new StringBuilder(numberStr);
		String reversed=		stringBuilder.reverse().toString();
				System.out.println(stringBuilder);
		return numberStr.equals(reversed);
	}

}

