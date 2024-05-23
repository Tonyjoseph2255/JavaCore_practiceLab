package org.ust;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		System.out.println("yyyy");
		try (// TODO Auto-generated method stub
				
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter an input string");
			String inputString = scanner.nextLine();
			System.out.println("Choose an operation:");
			System.out.println("A. Add the string to itself");
			System.out.println("B. Replace alternate positions with *");
			System.out.println("C. Remove duplicate characters");
			System.out.println("D. Change alternate characters to uppercase");
			char option = scanner.next().charAt(0);

			String result =changeString(inputString, option);
			System.out.println(result);
		}

	}

	private static String changeString(String inputString, char option) {
		switch (option) {
		case 'A':
			return inputString + inputString;
		case 'B':
			char[] charArray = inputString.toCharArray();
			for (int i = 0; i < inputString.length(); i += 2) {
				charArray[i] = '*';

			}
			return new String(charArray);
		case 'C':
			StringBuilder sb= new StringBuilder();
			for (int i = 0; i < inputString.length(); i++) {
				char c=inputString.charAt(i);
				if(sb.indexOf(String.valueOf(c))==-1) {
					sb.append(c);
				}
				
			}
			return sb.toString();
		case 'D':
			char[]char1=inputString.toCharArray();
			for(int i=0;i<char1.length;i+=2) {
				char1[i]=Character.toUpperCase(char1[i]);
				
						
			}return new String(char1);
			default:
                return "Invalid choice";
		
		}
	

	}

}
