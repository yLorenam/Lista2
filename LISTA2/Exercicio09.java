package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        double altura, imcF, imcM;
        int sexo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a altura: ");
        altura = sc.nextDouble();

        System.out.println("Informe o sexo: 1-F ou 2-M:");
        sexo = sc.nextInt();

        imcF = (62.1 * altura) - 44.7;
        imcM = (72.2 * altura) - 58;

        if (sexo == 1) {
            System.out.println("O peso ideal é: " + imcF);
        }
        if (sexo == 2) {
            System.out.println("O peso ideal é: " + imcM);
        }
    }
}
