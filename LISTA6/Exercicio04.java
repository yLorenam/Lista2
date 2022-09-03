package com.mycompany.lista6;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        int num[] = new int[20];
        boolean rept;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os 20 numeros desejados: ");
        for (int i = 0; i < 20; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            rept = true;
            for (int j = 0; j < 20; j++) {
                if (num[i] == num[j] && i != j) {
                    rept = false;
                    break;
                }
            }
            if (rept) {
                System.out.print("|" + num[i]);
            }
        }

    }
}
