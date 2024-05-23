package org.ust.mylearning;

public class SubstringsOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="jesu";
		 findSubstrings(str);

	}

	private static void findSubstrings(String str) {
		// TODO Auto-generated method stub
		int length=String.valueOf(str).length();
		System.out.println(length);
		for(int start=0;start<length;start++) {
			for(int end=start+1;end<=length;end++) {
				System.out.println(str.substring(start, end));
			}
		}
		
	}

}
