package org.example.desafio2;

import java.util.Scanner;
//Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma
// seja n. Um quadrado perfeito é um inteiro que é o quadrado de um inteiro;
// em outras palavras, é o produto de algum inteiro consigo mesmo.
// Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são.

//quadro perfeito : n x n = a
public class QuadradosPerfeitos {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

//n : numero que será analisado
        //d -> array de quadrados pefeitos dentro do numero

        //ex inserir 9
        int[] d = new int[n + 1]; //array com os numeros quadrados perfeitos
//


        for (int i = 1; i <= n; i++)
        {

            // If current element is
            // a perfect square
            if (Math.sqrt(i) == (int)Math.sqrt(i))
                System.out.print(i + " ");
        }
////        int quadradoPefeito = x * x;
//
//        Double raizQuadrada = Math.sqrt(n) ;
//               System.out.println(raizQuadrada);
//

//         Double produtoRaiz = (Math.sqrt(n)) * 2;
//        if ( produtoRaiz == n){
//            System.out.println("é quadrado");
//        }
//        else {
//            System.out.println("não é quadrado");
//        }
    }

        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.
    }
