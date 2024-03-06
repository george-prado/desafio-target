package org.georgeprado.exercises;

public class ex001 {
    public static void showAnswer() {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k += 1;
            soma += k;
        }

        System.out.println(soma);
    }
}
