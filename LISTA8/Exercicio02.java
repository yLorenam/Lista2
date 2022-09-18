package com.mycompany.lista08;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else if (i != j) {
                    matriz[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
