package org.example.estruturaRepeticao.arrays;


import java.util.Random;

//Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
//Ao final mostre os números e seus sucessores.
public class exercicio3 {
    public static void main(String[] args) {
        Random random = new Random(); //gerar numeros aleatórios
        //criar um array para guardar esses numeros
        int[] numerosAleatorios =  new int[20]; //declarar array e inicializar (tipo e numero de elementos)

        //criar um laço para guardar os números
        for  (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);//passar nos paramentos o limite do random
            numerosAleatorios[i] = numero;
        }
        System.out.println("Numeros aleatórios: ");
        for (int numero : numerosAleatorios ) {
//
            System.out.print( numero + " ");

        }


        // numeros sucessores -> numero + 1
        System.out.println("\nNumeros sucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios ) {
//            if (numero != null) //
            System.out.print( (numero+1) + " ");

        }
        

    }
    //for each: nao acessa posição específica, acessa o elemento
}

//psvm: public static void main
//sout