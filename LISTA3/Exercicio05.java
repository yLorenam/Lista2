package com.mycompany.lista3;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        double paisA, paisB;
        double crescA, crescB, anos = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a populacao do pais A:");
        paisA = sc.nextDouble();

        System.out.println("Informe a taxa de crescimento em % do pais A:");
        crescA = sc.nextDouble();

        System.out.println("Informe a populacao do pais B:");
        paisB = sc.nextDouble();

        System.out.println("Informe a taxa de crescimente em % do pais B:");
        crescB = sc.nextDouble();

        crescA = crescA / 100;
        crescB = crescB / 100;
        
        while (paisA < paisB) {
            paisA = paisA + (paisA * crescA);
            paisB = paisB + (paisB * crescB);
            anos = anos + 1;
        }
        System.out.println("Sera necessario " + anos + " anos para o pais A alcancar a populacao dos pais B");
    }
}
