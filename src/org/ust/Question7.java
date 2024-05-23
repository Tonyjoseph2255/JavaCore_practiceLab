package org.ust;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result =	alterString("java");
		System.out.println(result);

	}

	private static String alterString(String string) {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder= new StringBuilder();
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			if(isConsonants(ch)) {
				stringBuilder.append((char)(ch+1));
				
				
			}else {
				stringBuilder.append(ch);
			}
		}
		return stringBuilder.toString();
		
	}

	private static boolean isConsonants(char ch) {
		// TODO Auto-generated method stub
		ch= Character.toLowerCase(ch);
		
		return Character.isLetter(ch)&&!isNotVowel(ch);
	}

	private static boolean isNotVowel(char ch) {
		// TODO Auto-generated method stub
		return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
	}

}
