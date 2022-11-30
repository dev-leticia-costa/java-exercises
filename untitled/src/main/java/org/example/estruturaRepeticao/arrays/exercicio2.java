package org.example.estruturaRepeticao.arrays;

import java.util.Scanner;
//Faça um Programa que leia um vetor de 6 caracteres,
//e diga quantas consoantes foram lidas.
//Imprima as consoantes.

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String [6];//inicializando um array de 6 elementos
        int quantConsoante = 0;


        int count = 0;
        do{
            System.out.println("Insira uma letra: ");
            String letra = scan.next();//inicializar a letra

            //hipóteses de consoantes -> não vogais (se nao for a,e,i,o,u -> | (se for, já para a execução)
            if (!(letra.equalsIgnoreCase("a") |
             letra.equalsIgnoreCase("e") |
             letra.equalsIgnoreCase("i") |
             letra.equalsIgnoreCase("o") |
             letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;//pegar o array de consoantes e acrescentar a letra digitada, na posição do contador
               quantConsoante++; //se for igual, acrescentar a letra
                System.out.println("Números de consoantes: " + quantConsoante);

            }
            count++;

        }while(count < consoantes.length);// enquanto tiver menos de 6 posições
        //logica para pegar consoante - vogais (a,e,i,o,u)
        System.out.println("Consoantes: ");
        //saber quais foram as consoantes -> for each
        //foreach: -- elemento -- array de elementos --//
        for ( String consoanteLetra   :     consoantes) {//a cada loop, lê-se a consoante
         if (consoanteLetra != null) //evitar nulo - porque só vai inserir aa posição das consoantes (e não todas as posições)
             //retornou null porque é uma String (array de objetos) - se fosse int ou double = 0
         System.out.println(consoanteLetra + " ");


        }
         System.out.println("Quantidade de consoantes "+ quantConsoante);



    }
}