package org.example.estruturaRepeticao.loops;

import java.util.Scanner;

//Faça um programa que peça uma nota, entre zero e dez.
//Mostre uma mensagem caso o valor seja inválido
//e continue pedindo
//até que o usuário informe um valor válido.
//
public class exercicioLoops2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int nota;
        System.out.println("Insira uma nota entre 0 e 10");
        nota = scan.nextInt();//inicializar a variável

        while( nota < 0 | nota > 10) {
            System.out.println("Nota inválida. Por favor, insira novamente!");
            nota = scan.nextInt();

        }


//    10 >nota > 0

    }
}