package com.mycompany.lista08;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        int [][] matriz = new int [5][5]; 
        int linha = 0, coluna = 0, num;
        boolean check;
        
        Scanner sc = new Scanner(System.in);
        
        check = false;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Informe o numero desejado: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Informe o numero que deseja procurar: ");
        num = sc.nextInt();
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(matriz[i][j] == num){
                    linha = i;
                    coluna = j;
                    check = true;
                }
            }
        }
        if(check == true){
            System.out.println("O numero " + num + " foi encontrado na linha " + linha + " e na coluna " + coluna);       
        } else {
            System.out.println("O numero informado não foi encontrado!!");
        }
    }
}
