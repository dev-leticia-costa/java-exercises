package org.example.retornos;

import org.example.sobrecarga.Quadrilatero;

public class Main {
    public static void main(String[] args) {



        System.out.println("Exercicio");
        //criar variável para armezenar

        double areaQuadrado = QuadrilateroRetorno.area(1 );
        System.out.println("Área do quadrado: " + areaQuadrado);


        double areaRetangulo = QuadrilateroRetorno.area( 1d, 3.6d);
        System.out.println("Área do retangulo: " + areaRetangulo);


        double areaLosango = QuadrilateroRetorno.area( 1f, 3.6f);
        System.out.println("Área do losango: " + areaLosango);


        double areaTrapezio = QuadrilateroRetorno.area(2,3,4);
        System.out.println("Área do trapezio: " + areaTrapezio);

    }
}
