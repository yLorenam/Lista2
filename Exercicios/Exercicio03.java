package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        double a, b, c, delta, raizDelta, raiz1, raiz2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Formula equacao 2o grau: ax2 + bx + cx = 0");
        System.out.println("Informe o valor de a: ");
        a = sc.nextDouble();

        System.out.println("Informe o valor de b: ");
        b = sc.nextDouble();

        System.out.println("Informe o valor de c: ");
        c = sc.nextDouble();

        if (a != 0) {
            delta = (b * b) - (4 * a * c);
            raizDelta = (double) Math.sqrt(delta);
            if (delta > 0) {
                raiz1 = ((-1) * b + raizDelta) / (2 * a);
                raiz2 = ((-1) * b - raizDelta) / (2 * a);
                System.out.println("As raizes sao: " + raiz1 + " e " + raiz2);
            }
            if (delta == 0) {
                raiz1 = ((-1) * b + raizDelta) / (2 * a);
                System.out.println("A raiz é: " + raiz1);
            } else {
                delta = -delta;
                System.out.printf("Delta menor que '0' a equacao nao possui raiz real");

            }
        } else {
            System.out.println("Coeficiente 'a' inválido. Não é uma equação do 2o grau");
        }
    }
}
