package com.mycompany.lista6;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        double num[] = new double[10];
        int quant = 0;
        double soma = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe os 10 numeros desejados:");
            num[i] = sc.nextDouble();
            if (num[i] <= 0) {
                quant = quant + 1;

            } else if (num[i] >= 0) {
                soma = soma + num[i];
            }
        }
        System.out.println("A quantidade de numeros negativos incluidos foi: " + quant);
        System.out.println("A soma dos numeros positivos informados é: " + soma);
    }
}
