package com.mycompany.lista7;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        int[] vetA = new int[10];
        int[] vetB = new int[10];
        int[] resultC = new int[10];
        int i;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os numeros do vetor A:");
        for (i = 0; i < 10; i++) {
            vetA[i] = sc.nextInt();
        }

        System.out.println("Informe os numeros do vetor B:");
        for (i = 0; i < 10; i++) {
            vetB[i] = sc.nextInt();
        }
        
        for (i = 0; i < 10; i++) {
            resultC[i] = vetA[i] - (vetB[i] * vetA[i]);
            System.out.println("Vetor A - vetor B * Vetor A = " + resultC[i]);
        }
    }
}
