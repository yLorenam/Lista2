package com.mycompany.lista6;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        int num[] = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o " + (i + 1) + " numero: ");
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (num[i] == num[j]) {
                    System.out.println("|" + num[i] + "|");
                }
            }
        }
    }
}
