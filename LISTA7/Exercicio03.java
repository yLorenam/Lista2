package com.mycompany.lista7;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        int[] num = new int[6];
        int soma = 0, quant = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os 6 numeros desejados:");
        for (int i = 0; i < 6; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Os numeros pares são: ");
        for (int i = 0; i < 6; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
                soma = soma + num[i];
            }
        }
        System.out.println("A soma dos numeros pares é: " + soma);

        System.out.println("Os numeros impares são: ");
        for (int i = 0; i < 6; i++) {
            if (num[i] % 2 == 1) {
                System.out.println(num[i]);
                quant = quant + 1;
            }
        }
        System.out.println("A quantidade de numeros impares informados é: " + quant);
    }
}
