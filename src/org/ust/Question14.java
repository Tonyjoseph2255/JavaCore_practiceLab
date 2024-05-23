package org.ust;

import java.util.ArrayList;
import java.util.List;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
       List<Integer>result= removeElement(list1,list2);
       System.out.println(result);

	}
	public static List<Integer> removeElement(List<Integer> list1,List<Integer> list2) {
		list1.removeAll(list2);
		return list1;
		
		
	}

}
