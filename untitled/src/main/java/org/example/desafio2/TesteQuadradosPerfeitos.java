package org.example.desafio2;

import java.util.Scanner;

// Djair //
public class TesteQuadradosPerfeitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Menor quantidade de quadrados perfeitos para %d: %d \n", i, QuadradoLagrange.nQuadrados(i));
        }
    }
}
