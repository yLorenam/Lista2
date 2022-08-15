package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        int num;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero desejado: ");
        num = sc.nextInt();
        
        if(num % 2 == 0){
            num = num * 5;
            System.out.println("Como o numero informado é par multiplicamos por '5'");
            System.out.println("O resultado é: " + num);     
        }
        if(num % 3 == 0){
            num = num * 8;
            System.out.println("Como o numero informado é impar multiplicamos por '8'");
            System.out.println("O resultado é: " + num);
        }
    }
}
