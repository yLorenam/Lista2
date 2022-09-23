package com.mycompany.lista9;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int soma = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os numeros dejesados: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == j){
                    soma = soma + matriz[i][j]; 
                }
            }
        }
        System.out.println("A soma da diagonal principal da matriz é: " + soma);
    }
}
