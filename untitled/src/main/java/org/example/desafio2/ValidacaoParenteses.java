package org.example.desafio2;

import java.util.Scanner;
//Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']'
// determine se uma determinada string é válida.
//Caracteres de abertura devem ser fechadas pelo mesmo tipo.
// Abertura devem ser fechados com uma chave correspondente.
// Uma string vazia é considerada válida.

public class ValidacaoParenteses {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {


        return true;
        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.
    }
}
