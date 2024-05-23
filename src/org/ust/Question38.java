package org.ust;

import java.util.ArrayList;
import java.util.List;

public class Question38 {

	public static void main(String[] args) {
	int num=4;
	List<Integer>resultLIst=  getNumbers(num);
	System.out.println(resultLIst);
	}

	private static List<Integer> getNumbers(int num) {
		// TODO Auto-generated method stub
		List<Integer>factorList=new ArrayList<>();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				factorList.add(i);
			}
		}
		return factorList;
	}

}
