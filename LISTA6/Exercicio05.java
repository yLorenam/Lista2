package com.mycompany.lista6;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        double num[] = new double[5];
        int opcao;
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            System.out.println("Informe um numero: ");
            num[i] = sc.nextDouble();
        }
        System.out.println("Digite a opcao(0, 1 ou 2)");
        opcao = sc.nextInt();
        
        if(opcao == 1){
            System.out.println("Elementos do vetor em ordem direta: ");
            for(int i = 0; i < 5; i++){
                System.out.println(num[i]);
            }
        }else if(opcao == 2){
            System.out.println("Elemento do vetor em ordem inversa: ");
            for(int i = 4; i >= 0 ; i--){
                System.out.println(num[i]);
            }
        }else if(opcao != 0)
            System.out.println("Opcao invalida!!");
    }
}
