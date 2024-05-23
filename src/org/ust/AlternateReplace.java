package org.ust;

import java.util.ArrayList;

public class AlternateReplace {
    public static ArrayList<String> performOperations(String s1, String s2) {
        ArrayList<String> resultList = new ArrayList<>();
        
        // Operation 1: Replace characters in each alternate index of s1 with s2
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0 && i + 1 < s1.length()) {
                sb.append(s2);
            } else {
                sb.append(s1.charAt(i));
            }
        }
        resultList.add(sb.toString());
        
        return resultList;
    }

    public static void main(String[] args) {
        String s1 = "JAVAJAVA";
        String s2 = "VA";
        ArrayList<String> result = performOperations(s1, s2);
        System.out.println("Result: " + result);
    }
}

