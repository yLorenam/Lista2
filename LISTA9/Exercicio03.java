package com.mycompany.lista9;

import java.util.Random;

public class Exercicio03 {

    public static void main(String[] args) {
        int[][] cartela = new int[5][5];
        int cont = 0;

        Random gerador = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cartela[i][j] = gerador.nextInt(99);
                for (int k = i; k < 5; k++) {
                    if (cont == 1) {
                        j = j - 1;
                    }
                    for (int l = j; l < 5; l++) {
                        if (cartela[k][l] == cartela[i][j] && (k != i && l != j)) {
                            cont = cont + 1;
                        }
                    }
                }
            }
        }
        System.out.println("O numero da cartela é: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf(" " + cartela[i][j]);
            }
            System.out.print("\n");
        }
    }
}
