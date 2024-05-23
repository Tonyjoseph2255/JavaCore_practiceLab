package org.ust;

import java.util.HashMap;

public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] array= {'a','p','p','l','e'};
		 HashMap<Character, Integer> charCountMap = countCharacter(array);
		System.out.println(charCountMap);

	}

	private static HashMap<Character,Integer> countCharacter(char[] array) {
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		for(char elements :array) {
			if(charCountMap.containsKey(elements)) {
				charCountMap.put(elements, charCountMap.get(elements)+1);
				
			}else {
				charCountMap.put(elements, 1);
			}
		}
		return charCountMap;
		
	}

}
