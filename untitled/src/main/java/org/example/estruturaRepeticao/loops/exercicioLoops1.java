package org.example.estruturaRepeticao.loops;

//~~EXERCÍCIO 1~~
//Faça um programa que leia conjuntos de dois valores,
//o primeiro representando o nome do aluno e o segundo representando a sua idade.
//(Pare o programa inserindo o valor 0 no campo nome)

import java.util.Scanner;

public class exercicioLoops1 {
    public static void main(String[] args) {
        //"leia": fluxo de entrada - scanner

        Scanner scan = new Scanner(System.in);
        //valores nome e idade
        String nome;
        int idade;


        //COLOCAR variáveis no laço WHILE - ctrl + shift + cima

        while( true){

            System.out.println("Nome: ");//ctrl + d -> copiar linha de cima
            //atribuir nome à variável
            nome = scan.next();
            //pegar o nome

            //condição: Pare o programa inserindo o valor 0 no campo nome -
            if(nome.equals("0")) break;

            //atribuir idade à variavel
            System.out.println("Idade: ");
            //pegar a variável
            idade = scan.nextInt();
        }
        System.out.println("Parou, continua aqui...");






    }

}
