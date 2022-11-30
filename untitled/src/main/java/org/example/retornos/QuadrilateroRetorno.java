package org.example.retornos;
//recriar uma aplicação que calcule a área dos quadriláteros: quadrado, retangulo, trapézio e losango
//com retorno dos valores
public class QuadrilateroRetorno {
    //area do quadrado
    public static double area(double lado) {
        return lado * lado;

    }

    //area do retangulo
    public static double area(double lado1, double lado2) {
        return lado1 * lado2;

    }

    //area do trapézio
    public static double area(double baseMaior, double baseMenor, double altura) {
        return (baseMaior + baseMenor) * altura / 2;

    }

    //os tipos dos parâmetros podem mudar
    public static double area(float diagonal1, float diagonal2) {
        return ((diagonal2 * diagonal1) / 2);

    }

    //void pode usar return
    public static void xpto() {
        System.out.println("Antes");
        return;
    }

    //nao pode retornar tipos diferentes: ex
//    public static long xpto2(){
//         return 1.4;
//    }


}
