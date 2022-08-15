package com.mycompany.lista3;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        num1 = sc.nextInt();

        System.out.println("Informe o segundo numero:");
        num2 = sc.nextInt();

        System.out.println("Os numeros que estao entre o " + num1 + " e o " + num2 + " são:");
        while (num1 < (num2 - 1)) {
            num1 = num1 + 1;
            System.out.println(num1);
        }
        while (num2 < (num1 - 1)) {
            num2 = num2 + 1;
            System.out.println(num2);
        }
    }
}
