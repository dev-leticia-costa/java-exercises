package org.example.metodos;
//classe criada somenta para executar os métodos
public class Main {
    public static void main(String[] args) {

        //metodo static: possibilita ser chamado diretamente a partir de uma classe

        System.out.println("Exercicício 1 - Calculadora");
        Calculadora.somar(2,4);
        Calculadora.multiplicar(5,2);
        Calculadora.subtrair(4, 2);
        Calculadora.dividir(8,2);

        System.out.println("Exercicício 2 - Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        System.out.println("Exercicício 3 - Empréstimo");
        Emprestimo.calcular(100, 2);
        Emprestimo.calcular(100, 3);
        Emprestimo.calcular(100, 4);






    }
}
