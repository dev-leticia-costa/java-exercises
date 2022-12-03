package org.example.desafios;

import java.util.Scanner;

public class ChamadaRecursiva {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        int N = numero.nextInt();
        System.out.println(somatorio(N));
    }
    static int somatorio(int N) {
        int somatorioTotal;

        if (N == 0) {
            return 0;

        } else {
            somatorioTotal = (N + somatorio(N - 1));
//            System.out.println(somatorioTotal);

            return somatorioTotal;
        }
    }
}


   




