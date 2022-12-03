package org.example.desafios;

import java.util.Scanner;

public class DesafioMultiplos {
    public static void main(String[] args) {

        int A;
        int N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();





        int multiplosQuantidade = N / A;


        int somaPrimeiro = multiplosQuantidade * (multiplosQuantidade + 1) / 2;


        int somaMultiplos = A * somaPrimeiro;

        System.out.println(somaMultiplos);
    }


    }
