package org.ust;

public class Question24 {
    
    public static boolean isPositiveString(String str) {
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        // Iterate through the characters of the string
        for (int i = 0; i < charArray.length-1 ; i++) {
            // Compare the current character with the next character
        	if (charArray[i] > charArray[i + 1]) {
                // If the current character comes after the next character in alphabetical order, return false
                return false;
            }
        }
        
        // If all characters are in non-decreasing order, return true
        return true;
    }

    public static void main(String[] args) {
        // Test the method with example strings
        System.out.println(isPositiveString("xyz")); // true
        System.out.println(isPositiveString("apple")); // false
    }
}
