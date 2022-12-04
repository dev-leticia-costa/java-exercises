package org.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class exerciciosList {
    public static void main(String[] args) {


//        ArrayList<Double> notas = new ArrayList<>(); // nao recomendave iniciar assim pois nao utiliza a interface
        List<Double> notas = new ArrayList<Double>();// //generics: diamond operator <> ->
//          notas.add(7);//erro, tipo double
        notas.add(7.0);//erro, tipo double
        notas.add(8.0);
        notas.add(5.0);
        notas.add(6.0);
        notas.add(3.0);
        notas.add(2.0);
        notas.add(1.0);
        //para imprimir sout e toString
        System.out.println(notas.toString());
        //index of: retorna a posição
        System.out.println("Exibe a posição da nota 5.0: " + notas.indexOf(5d));

        //adicionando um elemento na posição x
        System.out.println("Adicione o elemento de valor nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        //substitui a nota 5 pela nota 7
        System.out.println("substitui a nota 5 pela nota 7: ");
        notas.set((notas.indexOf(5d)), 7d);
        System.out.println(notas);

        //confira se a nota 5 está na lista: deve retornar false, já que foi substituida
        System.out.println("Confira se a nota 7 está na lista: " + notas.contains(5d));

        //exibir todas as notas informadas : eles sao informados conforme a ordem de inserção
        System.out.println("exibir todas as notas na ordem em que foram informadas ");
        for (Double nota : notas) {
            System.out.println(nota);//nota: elemento

        }

        System.out.println("Exiba a terceira nota " + notas.get(2));
        System.out.println(notas.toString());

        //exiba a menor monta: nao há um método nativo da List, mas há um método da collection
        System.out.println("Exiba a menor monta :" + Collections.min(notas));
        System.out.println("Exiba a maior monta :" + Collections.max(notas));

        //soma: nao existe um método nativo, existe o iterator
        Iterator<Double> iterator = notas.iterator();//crtl + alt + v -> cria variavel
        Double soma = 0d;
        while (iterator.hasNext()) {//hasNext -> existe um item próximo, itera todos os itens
            Double next = iterator.next();
            soma += next;//guardou na variavel soma
        }
        System.out.println("Soma dos elementos: " + soma);

        //media -> método size (quantidade de elementos)
        System.out.println("Media dos elementos: " + (soma / notas.size()));

        System.out.println("Remova a nota 0");
        notas.remove(0d);//pode passar a posição ou o objeto -> se nao colocar o d, vai ser a posição 0
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {//hasNext -> existe um item próximo, itera todos os itens
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();

        }
        System.out.println(notas);

        //deletar toda a lista
        System.out.println("Apagar lista");
        notas.clear();

        //ver se lista está vazia
        System.out.println("Essa lista está vazia? " + notas.isEmpty());


    }


}
