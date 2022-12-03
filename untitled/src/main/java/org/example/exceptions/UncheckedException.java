package org.example.exceptions;

import javax.swing.*;

public class UncheckedException {

    public static void main(String[] args) {
        //caixa de dialogo para input
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            //lógica onde pode ocorrer a exception
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);

        }catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Impossossível dividir número por 0" );


        }catch (NumberFormatException e) {
            e.printStackTrace();//ver a mensagem no console
            JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro" );

        }
        finally {
            System.out.println("Chegou no finally");
        }
        System.out.println("O código continua");

    }
    public static int dividir(int a , int b) {

        return a/b;
    }

}
