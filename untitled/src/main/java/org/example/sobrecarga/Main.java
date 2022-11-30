package org.example.sobrecarga;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio");
        Quadrilatero.area(1 );
        Quadrilatero.area( 1d, 3.6d);
        Quadrilatero.area( 1f, 3.6f);
        Quadrilatero.area(2,3,4);

    }
}
