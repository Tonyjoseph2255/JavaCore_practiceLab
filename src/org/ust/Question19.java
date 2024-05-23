package org.ust;

import java.util.TreeSet;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 46, 7, 9, 7, 46, 5 };
		int[] finalArray = modifyArray(array);
		for (int finalElement : finalArray) {
			System.out.println(finalElement);
		}
	}

	public static int[] modifyArray(int[] array) {
		TreeSet<Integer> set = new TreeSet<>((a, b) -> Integer.compare(b, a));
		for (int num : array) {
			set.add(num);
		}
		int[] result = new int[set.size()];
		int index = 0;
		for (int num : set) {
			result[index++] = num;
		}

		return result;
	}

}
