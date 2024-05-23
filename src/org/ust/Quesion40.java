package org.ust;

public class Quesion40 {
    public static void main(String[] args) {
        double number = 123.456; // Example double number
        int[] sums = getDigitSums(number);
        System.out.println("Sum of digits on the left side of the decimal point: " + sums[0]);
        System.out.println("Sum of digits on the right side of the decimal point: " + sums[1]);
    }

    public static int[] getDigitSums(double number) {
        // Convert the double number to a string
        String numberStr = Double.toString(number);
        int[] sums = new int[2]; // Array to store sums

        // Split the string based on the decimal point
        String[] parts = numberStr.split("\\.");

        // Calculate sum of digits on the left side of the decimal point
        for (char ch : parts[0].toCharArray()) {
            if (Character.isDigit(ch)) {
                sums[0] += Character.getNumericValue(ch);
            }
        }

        // Calculate sum of digits on the right side of the decimal point
        if (parts.length > 1) {
            for (char ch : parts[1].toCharArray()) {
                if (Character.isDigit(ch)) {
                    sums[1] += Character.getNumericValue(ch);
                }
            }
        }

        return sums;
    }
}



