package com.mycompany.lista08;

public class Exercicio03 {

    public static void main(String[] args) {
        int [][] matriz = new int [4][4];
                
        for (int linha = 1; linha < 4; linha++) {
            for (int coluna = 1; coluna < 4; coluna++) {
                matriz[linha][coluna] = linha * coluna;
                System.out.printf(matriz[linha][coluna] + " ");
            }
            System.out.println(" ");
        }
    }
}
