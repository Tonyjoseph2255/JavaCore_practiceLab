package org.ust;

public class Question2 {

	public static void main(String[] args) {
		int result = calculateDifference(5);
		System.out.println(result);
	}

	private static int calculateDifference(int i) {
		int sum = 0;
		int sumOfSquares = 0;
		for (int n = 1; n <= i; n++) {
			sumOfSquares += n * n;
			sum += i;
		}
		System.out.println(sum);
		int squareOfSum = sum * sum;
		int difference = squareOfSum - sumOfSquares;
		return difference;

	}

}
