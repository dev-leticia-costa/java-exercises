package org.example.collections;

import java.util.HashMap;
import java.util.Map;

//
public class exerciciosMap {
    //map: chave valor
    //treemap: itera de acordo com as chaves
    //hashmap -> itera os elementos aleatoriamente
    //linkedhashmap: itera de acordo com a ordem de inserção
    public static void main(String[] args) {
        System.out.println("Crie um dicionario que relacione os modelos de carros e seus respectiovos consumos");
        Map<String, Double> carrosLista = new HashMap<>() {{
            put("gol", 14.0);
            put("uno", 13.0);
            put("sandero", 12.0);
            put("i30", 11.0);
            put("vectra", 10.0);
        }};
        System.out.println(carrosLista.toString());//exibir a lista

        System.out.println("Substitua o consumo do uno por 18.0 km/l");
        carrosLista.put("uno", 18.0);
        System.out.println(carrosLista.toString());

        //confira se na lista existe o carro tucson
        System.out.println("confira se na lista existe o carro tucson  " + carrosLista.containsKey("tucson"));
        //exiba o consumo do gol
        System.out.println("exiba o consumo do gol: " + carrosLista.get("gol"));

        //exiba todos os modelos
        System.out.println();


    }
}
