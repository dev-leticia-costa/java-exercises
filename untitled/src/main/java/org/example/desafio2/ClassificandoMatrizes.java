package org.example.desafio2;

import java.util.Scanner;

//Dado um array inteiro nums,
// mova todos os inteiros pares no início do array seguido por todos
// os inteiros ímpares.
//
//Retorne um array que satisfaça essa condição.
public class ClassificandoMatrizes {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int i = 0;
        int N = input.nextInt(); //N: numero de elementos do array
        int[] nums = new int[N];


        for (i = 0; i < N; i++) {
            nums[i] = input.nextInt();

            System.out.println(nums[i]);
        }

//
//        int count = 0;
//        while (count < (nums.length)) {
//            nums[i] = input.nextInt();
//
//            System.out.print(nums[count] + " ");
//            count++;
//        }
////        for (i = 0; i < N; i++) {
//            nums[i] = input.nextInt();
        //pares
//        List<Integer> listImpar = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//
//        for (i = 0; i < N; i++) {
//            nums[i] = input.nextInt();
//
//
//            if (nums[i] % 2 == 0) {
////                Arrays.stream(nums).skip(1).forEach(System.out::println);
//                list.add(nums[i]);
////                System.out.println(list);
//
//
//            } else {
////
//                listImpar.add(nums[i]);
////                System.out.println(listImpar);
//
//
//            }
//            List<Integer> newArray = new ArrayList<Integer>();
//            newArray.addAll(list);
//            newArray.addAll(listImpar);
//            System.out.println(newArray);
//        }
//

        //impares


//            System.out.println(nums[i]);

//            ArrayList<Integer> listaQuadrados = new ArrayList<>();
//            for (int i = 1; i * i <= number; i++) {
//                listaQuadrados.add(i * i);
//            }
//
//            return menorSoma(listaQuadrados, number);
//
//            System.out.println(nums[i]);


//            } else {
//
//                list.add(nums[i]);
//                System.out.println(list);
//            }
    }

//        ArrayList<Integer> nums = new ArrayList<>(N);
//        for (i = 0; i < N; i++) {
//            nums[i] = input.nextInt();
//        }
//        int count = 0;
//        while (count < (nums.length)) {
//            //length: retorna o tamanho o array -> 6
//            //count < (vetor.length)  ou count <= vetor.length  - 1 -> porque tem 7 posições (já que se inicia com a posição 0)
//            System.out.print(nums[count] + " ");
//            count++;
//        }
//
//        if (nums[i] % 2 == 0) {
//            Arrays.stream(nums).skip(0).forEach(System.out::println);
//
//
//        }
}





