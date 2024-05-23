package org.ust;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String []array= {"jesu","adhi","treasa","bini","mariya"};
	String[] result=getArrayList(array);
	
	for(String modifiedArray:result) {
		System.out.println(modifiedArray);	
	}
	

	}

	private static String[] getArrayList(String[] array) {
		
		ArrayList<String>arrayList=new ArrayList<>(Arrays.asList(array));
		Collections.sort(arrayList);
		System.out.println(arrayList);
		int changeIndex=arrayList.size()%2==0?arrayList.size()/2:arrayList.size()/2+1;
		System.out.println(changeIndex);
		for(int i=0;i<arrayList.size();i++) {
			if (i<changeIndex) {
				arrayList.set(i,arrayList.get(i).toUpperCase());
			}else {
				arrayList.set(i, arrayList.get(i).toLowerCase());
			}
		}
		return arrayList.toArray(new String[0]);
		
	}
	

}
