package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        int ladoA, ladoB, ladoC;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro angulo: ");
        ladoA = sc.nextInt();
        
        System.out.println("Informe o segundo angulo: ");
        ladoB = sc.nextInt();
        
        System.out.println("Informe o terceiro angulo: ");
        ladoC = sc.nextInt();
        
        if(ladoA == 90 || ladoB == 90 || ladoC == 90){
            System.out.println("O triangulo informado é o TRIANGULO RETANGULO");
        }
        if(ladoA > 90 || ladoB > 90 || ladoC > 90){
            System.out.println("O triangulo informado é o TRIANGULO OBTUSANGULO");
        }
        if(ladoA < 90 && ladoB < 90 && ladoC < 90){
            System.out.println("O triangulo informado é o TRIANGULO ACUTANGULO");
        }
    }
}
