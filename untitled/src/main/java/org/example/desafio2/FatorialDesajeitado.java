package org.example.desafio2;

import java.util.Scanner;
//código: Anderson Porto

// Fazemos um fatorial desajeitado usando os inteiros em ordem decrescente, trocando as operações de multiplicação
// por uma rotação fixa de operações cuja ordem é: multiplicar '*', dividir '/', adicionar '+' e subtrair '-'.
// Por exemplo, desajeitado(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1.
// Lembre-se que no fatorial desajeitado as operações ainda são aplicadas usando a ordem usual de
//operações aritméticas.
// Além disso, a divisão neste caso sempre resulta em um número inteiro, por exemplo, 90 / 8 = 11.
// Dado um inteiro N, retorne o fatorial desajeitado de n.
public class FatorialDesajeitado {

    public static void main(String[] args) {


        int number = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.println(fatorial(number));
    }


    public static int fatorial(int N) {
        int tempResult = N;
        int total = 0;
        char operator = '*';

        while (N > 1) {
            switch (operator) {
                case '*':
                    tempResult *= --N;
                    operator = '/';
                    break;
                case '/':
                    tempResult /= --N;
                    operator = '+';
                    break;
                case '+':
                    tempResult += --N;
                    operator = '-';
                    break;
                case '-':
                    total += tempResult;
                    tempResult = --N * (-1);
                    operator = '*';
                    break;
            }
        }
        return total + tempResult;
    }
}

////        int n;
//        //fatorial de um número inteiro positivo N
////        int res = 0; //produto de todos os inteiros positivos menores ou iguais a n.
////        int multiplicacao = 1;
//
//
//        //como fazer um fatoria de um número - fatorial normal
//
//
//        try {
//
//
//            int n = Integer.parseInt(new Scanner(System.in).nextLine());
//            //lógica onde pode ocorrer a exception
//
//            for (int i = n; i >= 1; i--) {//i -> 5,4,3,2,1
//
//                System.out.println("Fatorial do número: " + n);
//                i++;
//
//
////            while (int i = n; i >= 1; i--)
////                int desajeitado = 0;
//
////                desajeitado = desajeitado * i;
////
////                desajeitado = desajeitado / i;
////
////                desajeitado = desajeitado + i;
////
////                desajeitado = desajeitado - i;
////
//            }
//            System.out.println(desajeitado);
//
//        } catch (ArithmeticException e) {
//            JOptionPane.showMessageDialog(null, "Impossossível dividir número por 0");
//
//        }
////        System.out.println(res);
//    }
//}
//
//// int multiplicacao = 1;//multiplicar o i
////
////
////        System.out.println("Fatorial do número: " + fatorial);
////        for(int i = fatorial; i >= 1; i--){//i -> 5,4,3,2,1
////            multiplicacao = multiplicacao * i;
////
////        }
////        System.out.println(multiplicacao);