package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        double numA, numB, numC;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o valor de A: ");
        numA = sc.nextDouble();
        
        System.out.println("Informe o valor de B: ");
        numB = sc.nextDouble();
        
        if(numA == numB){
            numC = numA + numB;
            System.out.println("Como os valores de A e B sao igual sera feita a soma dos dois");
            System.out.println("Resultado: " + numA + " + " + numB + " = " + numC);
        }else{
            numC = numA * numB;
          System.out.println("Como os valores de A e B nao sao igual sera feita a multiplicacao dos dois");
            System.out.println("Resultado: " + numA + " * " + numB + " = " + numC);
        }
    }
}
