package org.ust.mylearning;

import java.util.ArrayList;
import java.util.List;

public class AddList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> firstName = new ArrayList<>();
		firstName.add("swathi");
		firstName.add("gayu");
		firstName.add("lakke");
		List<String> lastName = new ArrayList<>();
		lastName.add("kri");
		lastName.add("ekka");
		lastName.add("raja");
		addName(firstName, lastName);

	}

	private static void addName(List<String> firstName, List<String> lastName) {
		// TODO Auto-generated method stub
		for(int i=0;i<firstName.size();i++) {
			System.out.println("firstname="+firstName.get(i)+" "+"lastname"+lastName.get(i));
		}
		

	}

}
