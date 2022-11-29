package org.example;

import java.util.Scanner;

//Faça um programa que leia 5 números
//e informe o maior número
//e a média desses números.

public class exercicioLoops3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int numero;
        int maior = 0;
        int soma = 0;
        int media;

        int count = 0;
         do {
             System.out.println("Insira o numero");
             numero = scan.nextInt();//inicializar a variável

             soma = soma + numero;
//             System.out.println("Soma: " + soma);



             if(numero > maior ) maior = numero; //se o numero for maior, a variavel maior será o próprio numero

             count = count + 1;


         } while (count < 5);//contador menor que 5
        System.out.println("Maior: " + maior);
        System.out.println("Media: " + soma/5);



    }
}
