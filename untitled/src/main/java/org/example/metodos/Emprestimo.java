package org.example.metodos;

public class Emprestimo {
    //Calcule o valor final de um empréstimo, a partir
    //     do valor solicitado. Taxas e parcelas influenciam.
    //     Defina arbitrariamente as faixas que influenciam nos valores


    //criação de método para estipular taxa conforme número de parcelas

    public static double getDuasParcelas() {
        return 0.50;
    }
    public static double getTresParcelas() {
        return 1.50;

    }
    public static double getMaisDeQuatroParcelas() {
        return 2.50;

    }



    public static void calcular(double valor, double parcelas) {
        if (parcelas == 2){
            double valorFinal  =  valor + (valor * getDuasParcelas()) ;
            System.out.println("Valor final do empréstimo para 2 parcelas: " + valorFinal);
        }
        else if (parcelas == 3){
            double valorFinal  =  valor + (valor * getTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: " + valorFinal);
        }
        else {
            double valorFinal  =  valor + (valor * getMaisDeQuatroParcelas());
            System.out.println("Valor final do empréstimo para 4 parcelas ou mais: " + valorFinal);
        }


    }
}
