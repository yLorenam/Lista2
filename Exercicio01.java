package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        double numA, numB, numC;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor A: ");
        numA = sc.nextDouble();

        System.out.println("Informe o valor B: ");
        numB = sc.nextDouble();

        System.out.println("Informe o valor C: ");
        numC = sc.nextDouble();

        if (numA + numB < numC) {
            System.out.println("A soma dos valores A e B é: " + (numA + numB));
            System.out.println("A soma dos primeiros valores é menor que o valor C");
        }
        if (numA + numB > numC) {
            System.out.println("A soma dos valores A e B é: " + (numA + numB));
            System.out.println("A soma dos primeiros valores é maior que o valor C");
        }
        if(numA + numB == numC){
            System.out.println("A soma dos valores A e B é: " + (numA + numB));
            System.out.println("A soma dos primeiros valores é igual ao valor C ");
        }
    }
}
