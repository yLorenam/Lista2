package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        int num[] = new int[5];
        int temp = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o numero: ");
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (num[i] < num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("O ordem crescente dos numeros informados é: ");
        for (int k = 0; k < 5; k++) {
            System.out.println(num[k]);
        }
    }
}
