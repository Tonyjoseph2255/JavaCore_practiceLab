package org.ust;

import java.util.ArrayList;
import java.util.List;

public class Question26 {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        String target = "banana";
        search(stringList, target);
        System.out.println(stringList);

	}

	private static void search(List<String> stringList, String target) {
		
		for(int i=0;i<stringList.size();i++) {
			   if (stringList.get(i).equals(target)) {
				String firsthalf=target.substring(0, target.length()/2);
				stringList.set(i,firsthalf);
			}
		}
	
	}

}
