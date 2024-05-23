package org.ust;

import java.util.ArrayList;
import java.util.List;

public class Question34 {
    public static void main(String[] args) {
        // Example usage
        List<String> list1 = new ArrayList<>(List.of("Alice", "Bob", "Charlie", "David", "Eve"));
        List<String> list2 = new ArrayList<>(List.of("Alice", "Frank", "Charlie", "Grace", "David"));

        String[] commonNames = getEmployee(list1, list2);

        
        System.out.println("Common Names:");
        for (String name : commonNames) {
            System.out.println(name);
        }
    }

    public static String[] getEmployee(List<String> list1, List<String> list2) {
        // Create a new ArrayList to store common names
        List<String> commonNamesList = new ArrayList<>();

        // Iterate through each name in the first list
        for (String name : list1) {
            // Check if the name exists in the second list and add it to the commonNamesList if found
            if (list2.contains(name) ) {
                commonNamesList.add(name);
            }
        }

        // Convert the commonNamesList to a String array
        String[] commonNamesArray = new String[commonNamesList.size()];
        commonNamesArray = commonNamesList.toArray(commonNamesArray);

        return commonNamesArray;
    }
}
