package org.ust;

public class Question32 {
    public static String encrypt(String input ) {
        StringBuilder encryptedText = new StringBuilder();
        int shift = 9;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar)) {
                char base = Character.isUpperCase(currentChar) ? 'A' : 'a';
               
                encryptedText.append((char) ((currentChar - base + shift) % 26 + base));
            } else {
                encryptedText.append(currentChar);
            }
        }

        return encryptedText.toString();
    }

    public static void main(String[] args) {
        String original = "Ad";
       
        String encrypted = encrypt(original);
        System.out.println("Original: " + original);
        System.out.println("Encrypted: " + encrypted);
    }
}
