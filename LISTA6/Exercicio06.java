package com.mycompany.lista6;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        int num[] = new int[10];
        int numx;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero X:");
        numx = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um numero: ");
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (num[i] % numx == 0) {
                System.out.println("O numero " + num[i] + " é multiplo de " + numx);
            } else {
                System.out.println("O numero " + num[i] + " não é multiplo de " + numx);
            }
        }
    }
}
