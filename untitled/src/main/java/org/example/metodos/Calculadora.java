package org.example.metodos;

public class Calculadora {

    //soma, subtração, multiplicação e divisão.

    public static void somar (double valor1, double valor2){
      //armazena o resultado em uma variável temporária
        double resultado = valor1 + valor2;
        System.out.println( "A soma de " + valor1 + " + " +  valor2 + " é = "+  resultado);


    }
    public static void subtrair (double valor1, double valor2){

        double resultado = valor1 - valor2;
        System.out.println( "A subtração de " + valor1 + " + " +  valor2 + " é = "+  resultado);


    }
    public static void multiplicar(double valor1, double valor2){

        double resultado = valor1 * valor2;
        System.out.println( "A multiplicação de " + valor1 + " + " +  valor2 + " é = "+  resultado);


    }

    public static void dividir (double valor1, double valor2){

        double resultado = valor1 / valor2;
        System.out.println( "A divisão de " + valor1 + " + " +  valor2 + " é = "+  resultado);


    }
}
