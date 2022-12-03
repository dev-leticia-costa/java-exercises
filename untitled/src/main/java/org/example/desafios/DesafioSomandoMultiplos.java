package org.example.desafios;

import java.util.Scanner;

public class DesafioSomandoMultiplos {
    public static int calculate_sum(int a, int N) {

        // Number of multiples
        int m = N / a;

        // sum of first m natural numbers
        int sum = m * (m + 1) / 2;

        // sum of multiples
        int ans = a * sum;

        return ans;
    }

    // Driver code
    public static void main(String[] args) {

        int a = 7, N = 49;
        System.out.println("Sum of multiples of " + a +
                " up to " + N + " = " +
                calculate_sum(a, N));
    }
}
