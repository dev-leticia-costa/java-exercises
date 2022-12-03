package org.example.desafio2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuadradoLagrange {

    // Driver Code
    public static void main(String[] args) {
        int number = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println(nQuadrados(number));

    }

    public static int nQuadrados(int number) {

        double raizNumero = Math.sqrt(number);
        int raiz = (int) raizNumero;

        if (raizNumero == raiz) {
            return 1;
        }
        ArrayList<Integer> listaQuadrados = new ArrayList<>();
        for (int i = 1; i * i <= number; i++) {
            listaQuadrados.add(i * i);
        }

        return menorSoma(listaQuadrados, number);
    }


    public static int menorSoma(ArrayList<Integer> quadrados, int num) {
        int menor = num;
        for (int i = quadrados.size() - 1; i >= 0; i--) {
//            System.out.println("i vale " + i + " item vale " + quadrados.get(i));
            int soma = 0;
            if (quadrados.get(i) < num) {
                if (num % quadrados.get(i) == 0) {
                    soma += (num / quadrados.get(i));
                } else {
                    soma++;
                    int resto = num % quadrados.get(i);
                    soma += menorSoma(quadrados, resto);
                }
                menor = Math.min(menor, soma);
            }

        }
        return menor;
    }

}

