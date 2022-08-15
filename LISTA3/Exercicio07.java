package com.mycompany.lista3;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        int num, maior = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 4; i++) {
            System.out.println("Informe um numero:");
            num = sc.nextInt();
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println("O maior numero é o " + maior);
    }
}
