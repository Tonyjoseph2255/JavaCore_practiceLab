package org.ust;

public class Question31 {
    public static void main(String[] args) {
        int n = 5; // Number of elements in the Fibonacci series to generate
        generateFibonacciAndSumFactorials(n);
    }

    public static void generateFibonacciAndSumFactorials(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Series:");
        System.out.print(first + " " + second + " ");

        long factorialSum = 0; // Initialize sum of factorials

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");

            // Calculate factorial of 'next' element
            long factorial =1;
            for (int j = 1; j <= next; j++) {
                factorial *= j;
            }
            factorialSum += factorial;

            first = second;
            second = next;
        }

        System.out.println("\nSum of factorials of Fibonacci series elements: " + factorialSum);
    }
}
