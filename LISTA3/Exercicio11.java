package com.mycompany.lista3;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        int num1, num2, soma = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        num1 = sc.nextInt();

        System.out.println("Informe o segundo numero:");
        num2 = sc.nextInt();

        for (int i = (num1 + 1); i < num2; i++) {
            System.out.println(i);
            soma = soma + i;
        }

        for (int i = (num2 + 1); i < num1; i++) {
            System.out.println(i);
            soma = soma + i;
        }
        System.out.println("A soma dos numeros é: " + soma);
    }
}
