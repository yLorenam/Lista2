package com.mycompany.lista08;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int cont = 0;

        Scanner sc = new Scanner(System.in);

        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.println("Informe o numero desejado: ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                if (matriz[linha][coluna] > 10) {
                    cont = cont + 1;
                    System.out.println("O numero " + matriz[linha][coluna] + " é maior que o numero 10");
                }
            }
        }
        System.out.println("Foram inseridos " + cont + " numeros maiores que 10");
    }
}
