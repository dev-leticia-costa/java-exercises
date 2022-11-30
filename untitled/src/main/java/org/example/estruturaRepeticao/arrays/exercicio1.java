package org.example.estruturaRepeticao.arrays;
//Crie um vetor de 6 números inteiros
//e mostre-os na ordem inversa.
public class exercicio1 {
    public static void main(String[] args) {
        //declarando um vetor
        int[] vetor = {1,2,3,4,5,6};
       int count = 0;
//
//        System.out.println(vetor.length);
        System.out.println("Vetor: ");

        //retornar os elementos do vetor
        while (count < (vetor.length) ){
            //length: retorna o tamanho o array -> 6
            //count < (vetor.length)  ou count <= vetor.length  - 1 -> porque tem 7 posições (já que se inicia com a posição 0)
            System.out.print(vetor[count] + " ");
            count++;
        }
        //retornar os elementos em ordem inversa
        System.out.println("\nVetor na ordem inversa: " );
        //-----inicio-----parada---incremento/decremento---//
        for(int i = ( vetor.length - 1); i>=0; i--){

            System.out.print( vetor[i] + " ");

        }


        //ordem inversa de posição
        //quando se cria um array, a ordem colocada vincula os valores




    }
}
