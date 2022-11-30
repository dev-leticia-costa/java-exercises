package org.example.estruturaRepeticao.loops;

import java.util.Scanner;

//Desenvolva um gerador de tabuada
//O usuário deve informar de qual numero ele deseja ver a tabuada.
//A saída deve ser conforme o exemplo abaixo:
//Tabuada de 5:
//5 X 1 = 5
//5 X 2 = 10
//...
//5 X 10 = 50
public class exercicioLoops5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe qual número quer ver a tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de : " + tabuada);
        for (int i = 1; i <=10; i++){//i -> contador
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }
    }
}