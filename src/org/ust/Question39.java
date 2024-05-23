package org.ust;

public class Question39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = 123; // Example number
	        String[] equivalents = convertNumber(number);
	        System.out.println("Binary: " + equivalents[0]);
	        System.out.println("Hexadecimal: " + equivalents[1]);
	        System.out.println("Octal: " + equivalents[2]);

	}

	private static String[] convertNumber(int number) {
		// TODO Auto-generated method stub
		String binary= Integer.toBinaryString(number);
		String hexadecimal = Integer.toHexString(number);
		String octal = Integer.toOctalString(number);
		return new String []{binary, hexadecimal, octal};
	}

}
