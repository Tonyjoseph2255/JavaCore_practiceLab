package org.ust;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);

		list2.add(8);
		list2.add(10);
		list2.add(9);
		mergeData(list1,list2);
		char[] mergedArray = mergeData(list1, list2);
        System.out.println(mergedArray); 
	}

	private static char[] mergeData(ArrayList<Integer> list1, ArrayList<Integer> list2) {
	List<Integer>combined=new ArrayList<>();
	combined.addAll(list1);
	combined.addAll(list2);
	Collections.sort(combined);
	StringBuilder sb=new StringBuilder();
	for(Integer num :combined ) {
		sb.append(num);
		
	}
	String combinedString = sb.toString();
	return combinedString.toCharArray();
	
	
	}

}
