package org.ust.mylearning.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put ("Nani", 10000);
		map.put ("Chintu", 20000);
		map.put ("Kanni", 40000);
		map.put ("Harika", 15000);
		map.put ("Srinivas", 15000);
		map.put ("Srini", 20000);

try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter n value:");//2
			int nthHigestSalary = scanner.nextInt();

			List<String> names = getNames(map, nthHigestSalary);
			for (String name: names) {
				System.out.println(name);
			}
		}



	}

	private static List<String> getNames(Map<String, Integer> map, int nthHigestSalary) {
		// TODO Auto-generated method stub
		List<Integer>arrayList=new ArrayList<>();
		
		
		Map<String,Integer >map2= new HashMap<>();
		
		
		for (Map.Entry<String, Integer>entry:map.entrySet()){
	
			Integer studentList=		entry.getValue();
	
			arrayList.add(studentList);
			Collections.sort(arrayList);
			 map2.put(entry.getKey(), studentList);
		}
		
		System.out.println(arrayList);
		System.out.println(map2);
		return null;
	}

}
