
package com.mycompany.lista9;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int [][] matriz = new int [3][3];
        int soma = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe os numeros desejados: ");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();               
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               if(j < i){
                   soma = soma + matriz[i][j];
               }              
            }
        }
        System.out.println("A soma dos elementos abaixo da diagonal principal é: " + soma);
    }
}
