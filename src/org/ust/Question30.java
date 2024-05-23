package org.ust;

public class Question30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String code = "Cod1BC";
		boolean valid = validateCode(code);
		System.out.println(valid);

	}

	private static boolean validateCode(String code) {
		if ((code.length() != 6)) {
			return false;
		}
		if (!code.startsWith("Cod")) {
			return false;

		}
		boolean containDigit = false;
		for (char c : code.toCharArray()) {
			if (Character.isDigit(c)) {
				containDigit = true;
				break;
			}
		}
		if (!containDigit) {
			return false;
		}
		if (!Character.isUpperCase(code.charAt(0))) {
			return false;

		}
		for (char c : code.toCharArray()) {
			if (!Character.isLetterOrDigit(c)) {
				return false;
			}
		}
		int uppercaseCount = 0;
		int lowercaseCount = 0;
		for (char c : code.toCharArray()) {
			if (Character.isUpperCase(c)) {
				uppercaseCount++;

			} else if (Character.isLowerCase(c)) {
				lowercaseCount++;
			}
		}
		if (uppercaseCount <= lowercaseCount) {
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

}
