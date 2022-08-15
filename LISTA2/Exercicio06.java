package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        double num1, num2, num3;
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Informe o primeiro numero: ");
        num1 = sc.nextDouble();
        
        System.out.println("Informe o segundo numero: ");
        num2 = sc.nextDouble();
        
        System.out.println("Informe o terceiro numero: ");
        num3 = sc.nextDouble();
        
        if (num1 >= num2 && num1 >= num3 && num2 >= num3){
            System.out.println("A ordem decrescente é: " + num1 + ", " + num2 + " e " + num3);
        }
        if(num1 >= num2 && num1 >= num3 && num3 >= num2){
            System.out.println("A ordem decrescente é: " + num1 + ", " + num3 + " e " + num2);
        }
        if(num2 >= num1 && num2 >= num3 && num1 >= num3){
            System.out.println("A ordem decrescente é: " + num2 + ", " + num1 + " e " + num3);
        }
        if(num2 >= num1 && num2 >= num3 && num3 >= num1){
            System.out.println("A ordem decrescente é: " + num2 + ", " + num3 + " e " + num1);
        }
        if(num3 >= num1 && num3 >= num2 && num1 >= num2){
            System.out.println("A ordem decrescente é: " + num3 + ", " + num2 + " e " + num1);
        }
        if(num3 >= num1 && num3 >= num2 && num2 >= num1){
            System.out.println("A ordem decrescente é: " + num3 + ", " + num2 + " e " + num1);
        }
    }
}
