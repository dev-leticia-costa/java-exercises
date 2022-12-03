package org.example.desafio2;

import java.util.Scanner;

public class ValidacaoStack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        if (s.isBlank())
            return true;
        else {
            char[] c = s.toCharArray();
            if (c[0] == '{' && c[1] == '}' ||
                    c[0] == '(' && c[1] == ')' ||
                    c[0] == '[' && c[1] == ']') {
                return true;

            }

            return false;
        }
    }

}






