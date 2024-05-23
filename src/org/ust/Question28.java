package org.ust;

public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		int sum=findSum(num);
		System.out.println(sum);
	}

	private static int findSum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			int cube = (int) Math.pow(i, 3);
			sum = sum + cube;
		}
		
		return sum;

	}

}
