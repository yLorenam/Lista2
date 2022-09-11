package com.mycompany.lista7;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        double[] vet1 = new double[10];
        double[] vet2 = new double[10];
        double[] uniao = new double[20];
        int achou = 0, ate = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os numeros do primeiro vetor: ");
        for (int i = 0; i < 10; i++) {
            vet1[i] = sc.nextDouble();
        }

        System.out.println("Informe os numeros do segundo vetor: ");
        for (int i = 0; i < 10; i++) {
            vet2[i] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            uniao[i] = vet1[i];
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (vet2[i] == vet1[j]) {
                    achou = 1;
                    break;
                }
            }
            if (achou == 0) {
                uniao[i + 10] = vet2[i];
                ate = ate + 1;
            }
        }

        System.out.println("Os numeros informados nos dois vetores que nao se repetem são: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(uniao[i]);
        }
    }
}
