package org.ust;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Question29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Bannana");
        hashMap.put(3, "Apple");
        hashMap.put(2, "Orange");
        List<String> sortedValues = sortMapValues(hashMap);
        System.out.println("Sorted values: " + sortedValues);
	}

	private static List<String> sortMapValues(HashMap<Integer, String> hashMap) {
		List<String>values=new ArrayList<>(hashMap.values());
		Collections.sort(values);
		return values;
	}

}
