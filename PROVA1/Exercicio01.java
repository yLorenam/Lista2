package com.mycompany.provaintroducao;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
        int numMaior, numMenor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        num1 = sc.nextInt();

        System.out.println("Informe o segundo numero: ");
        num2 = sc.nextInt();

        System.out.println("Informe o terceiro numero: ");
        num3 = sc.nextInt();

        System.out.println("Informe o quarto numero: ");
        num4 = sc.nextInt();

        System.out.println("Informe o quinto numero: ");
        num5 = sc.nextInt();

        numMaior = num1;
        numMenor = num1;

        if (num2 > numMenor) {
            numMaior = num2;
        } else if (num2 < numMaior) {
            numMenor = num2;
        }
        if (num3 > numMenor) {
            numMaior = num3;
        } else if (num3 < numMaior) {
            numMenor = num3;
        }
        if (num4 > numMenor) {
            numMaior = num4;
        } else if (num4 < numMaior) {
            numMenor = num4;
        }
        if (num5 > numMenor) {
            numMaior = num5;
        } else if (num5 < numMaior) {
            numMenor = num5;
        }
        System.out.println("Dos valores digitados o numero maior é o: " + numMaior);
        System.out.println("E o numero menor é o: " + numMenor);
    }
}
