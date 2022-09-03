package com.mycompany.lista6;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        double num[] = new double[5];
        double maior = 0, menor = 0, media = 0;
        int i = 0;
        double soma = 0;

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            System.out.println("Informe os 5 numeros desejados: ");
            num[i] = sc.nextDouble();
            soma = soma + num[i];

            if (i == 0) {
                maior = num[i];
                menor = num[i];
            } else if (num[i] > maior) {
                maior = num[i];
            } else if (num[i] < menor) {
                menor = num[i];
            }
        }
        media = soma / 5;
        System.out.println("O numero maior é: " + maior);
        System.out.println("O numero menor é: " + menor);
        System.out.println("A media dos numeros informados é: " + media);
    }
}
