package org.ust;

public class Question44 {
    public static void main(String[] args) {
        int number = 10; // Example number
        String words = convertNumberToWords(number);
        System.out.println(words);
    }

    public static String convertNumberToWords(int number) {
        if (number == 0) {
            return "zero";
        }

        StringBuilder words = new StringBuilder();

        while (number > 0) {
            int digit = number % 10;
            words.insert(0, convertSingleDigitToWord(digit));
            number /= 10;
        }

        return words.toString();
    }

    private static String convertSingleDigitToWord(int digit) {
        switch (digit) {
            case 0: return "zero ";
            case 1: return "one ";
            case 2: return "two ";
            case 3: return "three ";
            case 4: return "four ";
            case 5: return "five ";
            case 6: return "six ";
            case 7: return "seven ";
            case 8: return "eight ";
            case 9: return "nine ";
            default: return ""; // Not reachable for valid input
        }
    }
}
