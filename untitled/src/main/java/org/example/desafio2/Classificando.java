package org.example.desafio2;

import java.util.Scanner;

public class Classificando {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i;
        int N = input.nextInt();
        int[] arr = new int[N];
        for (i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        replace(arr);
    }


    static void replace(int[] arr) {

        int n = arr.length;


        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {


                if (arr[i] >= 0
                        && arr[j] >= 0
                        && arr[i] % 2 == 0
                        && arr[j] % 2 != 0) {


                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;


                    break;
                } else if (arr[i] >= 0
                        && arr[j] >= 0
                        && arr[i] % 2 != 0
                        && arr[j] % 2 == 0) {


                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;


                    arr[j] = -arr[j];

                    break;
                }
            }
        }


        for (int i = 0; i < n; i++)
            arr[i] = Math.abs(arr[i]);


        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }


}

