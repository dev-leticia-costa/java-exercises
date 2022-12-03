package org.example.desafio2;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite uma palavra ");

        String palavra = sc.nextLine();

//        String palavraInvertida;


//        if( palavraInvertida == palavra)

        String palindromo = new StringBuilder(palavra).reverse().toString();



        boolean ePalindromo = true;
        if ((palavra.equalsIgnoreCase(palindromo))) {
            ePalindromo = true;


            System.out.println("TRUE");

        } else {
            ePalindromo = false;

            System.out.println("FALSE");
        }
    }
}
