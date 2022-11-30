package org.example.sobrecarga;
//mudar os parametros e manter o nome do método
//ex: println()
//println(boolean x)
//println(String xx)
//diferente de sobrescrita: ligado à herança


//criar uma aplicação que calcule a área dos quadriláteros: quadrado, retangulo, trapézio e losango
public class Quadrilatero {

    //area do quadrado
    public static void area(double lado) {
        System.out.println("Área do quadrado: "+ lado * lado);

    }
    //area do retangulo
    public static void area(double lado1, double lado2) {
        System.out.println("Área do retangulo: "+ lado1 * lado2);

    }
    //area do trapézio
    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapezio: " + ((baseMaior+baseMenor)*altura/2));

    }
    //os tipos dos parâmetros podem mudar
    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Área do losango: " + ((diagonal2 * diagonal1)/2));

    }

}
