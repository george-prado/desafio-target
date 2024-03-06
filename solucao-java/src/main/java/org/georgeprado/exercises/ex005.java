package org.georgeprado.exercises;

import java.util.Scanner;
public class ex005 {
    public static void showAnswer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String wordInput = scanner.nextLine();

        if (!wordInput.isEmpty()) {
            System.out.printf("Palavra invertida: %s%n", inverter(wordInput));
        } else {
            System.out.println("Por favor, insira uma string válida.");
        }

        scanner.close();
    }

    static String inverter(String word) {
        char[] letras = word.toCharArray();
        int length = letras.length;

        for (int i = 0, j = length - 1; i < j; i++, j--) {
            char temp = letras[i];
            letras[i] = letras[j];
            letras[j] = temp;
        }

        return new String(letras);
    }
}
