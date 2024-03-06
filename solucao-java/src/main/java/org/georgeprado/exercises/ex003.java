package org.georgeprado.exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class ex003 {
    public static void showAnswer() {
        // A)
        System.out.print("A) ");
        for (int i = 1; i <= 9; i += 2) {
            System.out.print(i);
            if (i < 9) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        // B)
        System.out.print("B) ");
        for (int i = 1; i <= 7; i++) {
            double answer = Math.pow(2, i);
            System.out.print(answer);
            if (i < 7) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        // C)
        System.out.print("C) ");
        for (int i = 0; i <= 7; i++) {
            double answer = Math.pow(i, 2);
            System.out.print(answer);
            if (i < 7) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        // D)
        System.out.print("D) ");
        for (int i = 2; i <= 10; i += 2) {
            double answer = Math.pow(i, 2);
            System.out.print(answer);
            if (i < 10) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }

        // E)
        System.out.print("E) ");
        int[] fibonacci = new int[8];
        int start = 0;
        int next = 1;
        for (int i = 0; i < 8; i++) {
            fibonacci[i] = start;
            int temp = next;
            next += start;
            start = temp;
        }
        System.out.println(Arrays.toString(fibonacci));

        // F)
        System.out.print("F) ");
        Map<Integer, String> numerosPorExtenso = new HashMap<>();
        numerosPorExtenso.put(2, "Dois");
        numerosPorExtenso.put(10, "Dez");
        numerosPorExtenso.put(12, "Doze");
        numerosPorExtenso.put(16, "Dezesseis");
        numerosPorExtenso.put(17, "Dezessete");
        numerosPorExtenso.put(18, "Dezoito");
        numerosPorExtenso.put(19, "Dezenove");
        numerosPorExtenso.put(200, "Duzentos");

        System.out.println(numerosPorExtenso.keySet());
        System.out.println(numerosPorExtenso.values());
    }

    public static void main(String[] args) {
        showAnswer();
    }
}
