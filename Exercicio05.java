package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        double num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero desejado: ");
        num = sc.nextDouble();

        if (num < 0) {
            System.out.println("O numero informado é negativo, entao ira ser multiplicado por '3'");
            System.out.println("O resultado da multiplicacao é : " + num * 3);
        }
        if (num >= 0) {
            System.out.println("O numero informado é positivo, entao ira ser multiplicado por '2'");
            System.out.println("O resultado da multiplicacao é : " + num * 2);
        }
    }
}
