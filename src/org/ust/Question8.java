package org.ust;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = { 5, 2, 7, 9, 3 };
		// Convert array to ArrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(array));

		Collections.sort(arrayList);

		System.out.println("Sorted ArrayList: " + arrayList);

		int result = getSecondSmallest(arrayList);
		System.out.println(result);

	}

	private static int getSecondSmallest(ArrayList<Integer> array) {
		// TODO Auto-generated method stub
		if (array.size() < 2) {
			throw new IllegalArgumentException("arraylist must contain atleast two element");
		}

		return array.get(array.size() - (array.size() - 1));
	}

}
