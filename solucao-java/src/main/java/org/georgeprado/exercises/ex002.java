package org.georgeprado.exercises;

import java.util.Scanner;
import java.util.Arrays;

public class ex002 {
    public static void showAnswer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numEntry = scanner.nextInt();

        int[] fibonacci = generateFibonacci(numEntry);

        System.out.printf("%d %s na sequência de Fibonacci.%n",
                numEntry, (isInFibonacci(numEntry, fibonacci) ? "está" : "NÃO está"));

        scanner.close();
    }

    public static int[] generateFibonacci(int numEntry) {
        int[] fibonacci = { 0, 1 };

        while (fibonacci[fibonacci.length - 1] < numEntry) {
            int nextTerm = fibonacci[fibonacci.length - 1] + fibonacci[fibonacci.length - 2];
            fibonacci = Arrays.copyOf(fibonacci, fibonacci.length + 1);
            fibonacci[fibonacci.length - 1] = nextTerm;
        }

        return fibonacci;
    }

    public static boolean isInFibonacci(int num, int[] fibonacci) {
        for (int fibo : fibonacci) {
            if (fibo == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        showAnswer();
    }
}