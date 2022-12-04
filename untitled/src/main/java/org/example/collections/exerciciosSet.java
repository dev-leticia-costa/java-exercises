package org.example.collections;

import java.util.*;

public class exerciciosSet {
    //set: nao permite elementos duplicados e não possui indice (não tem os métodos get, set, indexOf)
    // Aqui nao consegue substituir um elemento
    //List e Set implementam a interface Collections

    public static void main(String[] args) {
        //nao tem ordem e elementos repetidos só entram uma vez
        System.out.println("Crue um conjunto e adicion as seguintes notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(8d, 1d, 2d, 3d, 4d, 9d, 3.5d));

        System.out.println("Confira se a nota 4 está presente: " + notas.contains(5d));

        System.out.println("Exiba a menor monta :" + Collections.min(notas));

        System.out.println("Exiba a maior monta :" + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();//crtl + alt + v -> cria variavel
        Double soma = 0d;
        while (iterator.hasNext()) {//hasNext -> existe um item próximo, itera todos os itens
            Double next = iterator.next();
            soma += next;//guardou na variavel soma
        }
        System.out.println("Soma dos elementos: " + soma);

        System.out.println("Media dos elementos: " + (soma / notas.size()));

        System.out.println("Remova a nota 1");
        notas.remove(1d);//pode passar a posição ou o objeto -> se nao colocar o d, vai ser a posição 0
        System.out.println(notas);

        //exiba todas as notas informadas na ordem crescente
        System.out.println("Exiba as notas na ordem crescente: ");
        Set<Double> notas2 = new TreeSet<>(notas);
        System.out.println(notas2);
    }
}
