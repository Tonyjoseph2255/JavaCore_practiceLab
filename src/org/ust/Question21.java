package org.ust;
import java.util.HashMap;
import java.util.Map;

public class Question21 {
    public static void main(String[] args) {
        String input = "tamilnadu||chennai-karnataka||bengaluru";
        String stateCapitalDelimiter = "-";
        String pairDelimiter = "\\|\\|";
        // Parse the input string and create the map
        Map<String, String> stateCapitalMap = parseStateCapital(input, stateCapitalDelimiter,pairDelimiter );

        // Print the map
        System.out.println("State-Capital Map: " + stateCapitalMap);
    }

    public static Map<String, String> parseStateCapital(String input, String stateCapitalDelimiter, String pairDelimiter) {
        Map<String, String> stateCapitalMap = new HashMap<>();

        // Split the input string into state-capital pairs
        String[] stateCapitalPairs = input.split(stateCapitalDelimiter);

        // Iterate over each state-capital pair
        for (String pair : stateCapitalPairs) {
            // Split each pair into state and capital
            String[] parts = pair.split(pairDelimiter);

            // Ensure that there are exactly two parts (state and capital)
            if (parts.length == 2) {
                // Add state-capital pair to the map
                stateCapitalMap.put(parts[0], parts[1]);
            } else {
                // Handle invalid input (e.g., ignore or throw an exception)
                System.err.println("Invalid state-capital pair: " + pair);
                }
            }
		return stateCapitalMap;
        }
    }
           
