package org.ust;

import java.util.ArrayList;

public class Question9 {

    public static void main(String[] args) {
        String s1 = "JAVAJAVA";
        String s2 = "VA";

        ArrayList<String> resultList = modifyString(s1, s2);
        System.out.println("Result List: " + resultList);
    }

    public static ArrayList<String> modifyString(String s1, String s2) {
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
        
        

       
        // Operation 2: Replace the last occurrence of s2 in s1 with the reverse of s2 or append s2 to s1
        int lastIndexOfS2 = s1.lastIndexOf(s2);
        if (lastIndexOfS2 != -1 && s1.indexOf(s2) != lastIndexOfS2) {
            StringBuilder modifiedString2 = new StringBuilder(s1);
            modifiedString2.replace(lastIndexOfS2, lastIndexOfS2 + s2.length(), new StringBuilder(s2).reverse().toString());
            resultList.add(modifiedString2.toString());
        } else {
            resultList.add(s1 + s2);
        }

        // Operation 3: Delete the first occurrence of s2 in s1 or return "$1"
        int firstIndexOfS2 = s1.indexOf(s2);
        if (firstIndexOfS2 != -1) {
            StringBuilder modifiedString3 = new StringBuilder(s1);
            modifiedString3.delete(firstIndexOfS2, firstIndexOfS2 + s2.length());
            resultList.add(modifiedString3.toString());
        } else {
            resultList.add("$1");
        }

        // Operation 4: Divide s2 into two halves and add them to the beginning and end of s1
        int halfLength = (s2.length() + 1) / 2;
        String firstHalf = s2.substring(0, halfLength);
        String secondHalf = s2.substring(halfLength);
        resultList.add(firstHalf + s1 + secondHalf);

        // Operation 5: Replace characters in s1 that are in s2 with "*"
        StringBuilder modifiedString5 = new StringBuilder();
        for (char c : s1.toCharArray()) {
            modifiedString5.append(s2.contains(Character.toString(c)) ? '*' : c);
        }
        resultList.add(modifiedString5.toString());

        return resultList;
    }
}
