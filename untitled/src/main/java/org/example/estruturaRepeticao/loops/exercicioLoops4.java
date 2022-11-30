package org.example.estruturaRepeticao.loops;

import java.util.Scanner;

//Faça um programa que peça N números inteiros,
//calcule e mostre a quantidade de números pares
//e a quantidade de números impares.
public class exercicioLoops4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numerosContador = 0;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;


        System.out.println("Informe a quantidade de numeros: " );
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Informe o numero: ");
            numero = scan.nextInt();
            numerosContador++;
            if (numero % 2 == 0){
                quantPares++;

            }
            else{
                quantImpares++;
            }



        }
            while(numerosContador < quantNumeros);
        System.out.println("Quantidade de números pares: " + quantPares);
        System.out.println("Quantidade de números ímpares: " + quantImpares);




    }
}
