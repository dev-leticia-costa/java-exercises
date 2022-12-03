//package org.example.exceptions;
//
//import javax.swing.*;
//
//public class UncheckedWithWhile {
//    public static void main(String[] args) {
//        //caixa de dialogo para input
//        boolean continueLooping = true;
//
//        do {
//            String a = JOptionPane.showInputDialog("Numerador: ");
//            String b = JOptionPane.showInputDialog("Denominador: ");
//
//            try {
//                //lógica onde pode ocorrer a exception
//                int resultado = divisible(Integer.parseInt(a), Integer.parseInt(b));
//                System.out.println("Resultado: " + resultado);
//                continueLooping = false;
//
//            } catch (ArithmeticException e) {
//                e.printStackTrace();/
//                JOptionPane.showMessageDialog(null, "Impossossível dividir número por 0");
//
//
//            } catch (NumberFormatException e) {
//                e.printStackTrace();//ver a mensagem no console
//                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro");
//
//            } finally {
//                System.out.println("Chegou no finally");
//            }
//
//        } while (continueLooping);
//
//        System.out.println("O código continua");
//
//    }
//
//    private static int divisible(int a, int b) {
//        return a / b;
//
//    }
//}
//}
//
//
