package org.example.estruturaRepeticao.arrays;

import java.util.Random;

//Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
public class exercicio4 {
    public static void main(String[] args) {

        int num = 5, count = 1;
        do {
            num += count;
            System.out.println(num);
        } while (count <= 3);
//        Random random = new Random();
//        //array multidimensional -> linha e coluna (cada linha representa um array)
//        // x x x x
//        // x x x x
//        // x x x x
//        // x x x x
//
//        int[][] matriz = new int[4][4];
//
//        //percorrer elementos da linha
//        for (int i = 0; i < matriz.length; i++){
//            //percorrer cada coluna de uma linha - percorrer até o j ser menor que a linha
//            for (int j = 0; j < matriz[i].length; j++){
//            matriz[i][j] = random.nextInt(9);
//            }
//
//        }
//        System.out.println("Matriz: ");
//        //pegar elementos da linha e da coluna
//        for (int[] linha : matriz             ) {
//            //elemento conluna dentro da linha
//            for ( int elementoColuna : linha  ) {
//                System.out.print(elementoColuna + " ");
//
//            }
//            //próxima linha
//            System.out.println();
//
//        }


    }
}
