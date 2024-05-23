package org.ust;

import java.util.Iterator;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number= 45862;
		int result=modifyNumber(number);
		System.out.println(result);

	}

	private static int modifyNumber(int number) {
		String numStr=String.valueOf(number);
		StringBuilder stringBuilder= new StringBuilder();
		for(int i=0;i<numStr.length()-1;i++) {
			
			int digit1=Character.getNumericValue(numStr.charAt(i));
			
			int digit2=Character.getNumericValue(numStr.charAt(i+1));
			System.out.println(digit2);
			stringBuilder.append(Math.abs(digit2-digit1));
		}
		int firstDigit= Character.getNumericValue(numStr.charAt(0));
		int lastigit=Character.getNumericValue(numStr.charAt(numStr.length()-1));
		stringBuilder.append(Math.abs(lastigit-firstDigit));
		return Integer.parseInt(stringBuilder.toString());
		
		
	}

}
