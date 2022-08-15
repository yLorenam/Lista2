package com.mycompany.lista3;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        int num1, num2, num3, num4, num5, soma;
        double media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        num1 = sc.nextInt();
        
        System.out.println("Informe o segundo numero:");
        num2 = sc.nextInt();
        
        System.out.println("Informe o terceiro numero:");
        num3 = sc.nextInt();
        
        System.out.println("Informe o quarto numero:");
        num4 = sc.nextInt();
        
        System.out.println("Informe o quinto numero:");
        num5 = sc.nextInt();
        
        soma = num1 + num2 + num3 + num4 + num5;
                
        media = soma / 5;
        
        System.out.println("A soma dos numeros é: " + soma);
        System.out.println("A media dos numeros é: " + media);
    }
}
