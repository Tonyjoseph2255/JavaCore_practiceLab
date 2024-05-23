package org.ust;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] array= {11,8,7,46,18};
		Integer[] result=getSorted(array);
		for(Integer array1:result) {
			System.out.println(array1);
		}

	}


	private static Integer[] getSorted(Integer[] array) {
		List<Integer>arrayList=new ArrayList<>(Arrays.asList(array));
		
		for(int i=0;i<arrayList.size();i++) {
			String numString=array[i].toString();
			String reversNo=new StringBuilder(numString).reverse().toString();
			array[i]=Integer.parseInt(reversNo);
		}
		//Arrays.sort(array,Collections.reverseOrder());
		return array;
		
		
		
		
	}
}
