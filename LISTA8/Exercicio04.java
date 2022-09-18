package com.mycompany.lista08;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int maior, posLinha = 1, posColuna = 1;

        Scanner sc = new Scanner(System.in);

        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.println("Informe o valor desejado: ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        maior = matriz[0][0];

        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                    posLinha = linha + 1;
                    posColuna = coluna + 1;
                }
            }
        }
        System.out.println("O maior valor informado foi " + maior + " na posicao linha " + posLinha + " na coluna " + posColuna);
    }
}
