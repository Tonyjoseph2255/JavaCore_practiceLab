package org.ust;

import java.util.HashMap;
import java.util.Map;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = { 1, 2, 3, 4, 5 };
		Map<Integer, Integer> squareMap = getSquares(number);
		for (Map.Entry<Integer, Integer> entry : squareMap.entrySet()) {
			System.out.println(entry);

		}

	}

	private static Map<Integer, Integer> getSquares(int[] number) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int numbers : number) {
			map.put(numbers, numbers * numbers);
		}
		return map;
	}

}
