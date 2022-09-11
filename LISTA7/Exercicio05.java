package com.mycompany.lista7;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        int linha;
        int[] pascal = new int[100];
        int aux1 = 0, aux2;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero de linhas desejado: ");
        linha = sc.nextInt();

        pascal[0] = 1;

        for (int i = 0; i < linha; i++) {

            for (int j = 0; j < 10; j++) {
                aux2 = aux1 + pascal[j];
                aux1 = pascal[j];
                pascal[j] = aux2;
                System.out.printf("%3d", pascal[j]);
            }
            System.out.println(" ");
        }

    }
}
