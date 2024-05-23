package org.ust;

public class Question27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 60;
		int sum = findSum(num);
		System.out.println(sum);
	}

	public static int findSum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {

			if (i % 3 == 0 && i % 8 == 0) {
				sum = sum + i;

			}
		}
		return sum;

	}

}
