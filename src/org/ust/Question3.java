package org.ust;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = getImage("hello");
		System.out.println(result);
	}

	private static String getImage(String string) {
		StringBuilder stringBuilder = new StringBuilder(string);
		stringBuilder.reverse();
		return string + "||" + stringBuilder.toString();

	}

}
