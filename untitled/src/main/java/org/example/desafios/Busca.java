package org.example.desafios;

import java.util.Scanner;

public class Busca {
    public static void main (String args[]){

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};




        System.out.println("O vetor contém os seguintes valores:");
        for (int i = 0; i < elementos.length; i++) {

            System.out.println("Elemento " + i + " = " + elementos[i]);
          }


        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o número a ser buscado no vetor:");
        int numero = leitor.nextInt(); //Número digitado pelo usuário para se comparado com os valores gerados no vetor acima.

        boolean bolFound = false;
        int indFound = 0;


        for (int i = 0; i <= 9; i++){
            if (elementos[i] == numero){
                bolFound = true;
                indFound = i;
            }

        }


        if (bolFound == true)
        {
            System.out.println("Achei " + numero  + " na posicao " + indFound );
        }
        else
        {
            System.out.println("Numero " + numero + " nao encontrado!");
        }
    }
}

