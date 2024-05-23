package org.ust;

import java.util.ArrayList;
import java.util.List;

public class Qusetion15 {
	public static void main(String[] args) {
		// Create a list
		List<String> originalList = new ArrayList<>();
		originalList.add("apple");
		originalList.add("banana");
		originalList.add("orange");
		originalList.add("grape");

		originalList.add("kiwi");

		// Create a list of elements to keep
		List<String> elementsToKeep = new ArrayList<>();
		elementsToKeep.add("banana");
		elementsToKeep.add("grape");

		// Call the method to filter the list
		List<String> result = removeElements(originalList, elementsToKeep);
		System.out.println(result);

	}

	public static List<String> removeElements(List<String> originalList, List<String> elementsToKeep) {

		// Create a temporary list to store elements to remove
		List<String> elementsToRemove = new ArrayList<>(originalList);
		System.out.println(elementsToRemove);
		// Retain only the elements specified in elementsToKeep list
		elementsToRemove.retainAll(elementsToKeep);
		System.out.println(elementsToKeep);
		
		
		return elementsToRemove;
	}
}
