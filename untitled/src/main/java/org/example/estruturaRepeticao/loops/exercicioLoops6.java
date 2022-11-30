package org.example.estruturaRepeticao.loops;

import java.util.Scanner;

//Faça um número que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex: 5! = 120 (5x4x3x2x1)
public class exercicioLoops6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int fatorial;
        System.out.println("Fatorial do número: ");
        fatorial = scan.nextInt();

        int multiplicacao = 1;//multiplicar o i


        System.out.println("Fatorial do número: " + fatorial);
        for(int i = fatorial; i >= 1; i--){//i -> 5,4,3,2,1
            multiplicacao = multiplicacao * i;

        }
        System.out.println(multiplicacao);
    }
}
//ctrl + shift +f10 -> mudar o run
//quando utilizar, FOR, WHILE, ou DO WHILE?
//DICA:
// FOR -> contador
//laços infinitos (sem dizer quantas vezes) -> while
//executar o programa uma vez antes de conferir a sentença -> Do while


//DEBUG: SHIFT + F9