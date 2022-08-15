package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio10 {
    
    public static void main(String[] args) {
        int l1, l2, l3;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a medida do primeiro lado: ");
        l1 = sc.nextInt();
        
        System.out.println("Informe a medida do segundo lado: ");
        l2 = sc.nextInt();
        
        System.out.println("Informe a medida do terceiro lado: ");
        l3 = sc.nextInt();
        
        if(l1 == l2 && l1 == l3){
            System.out.println("O Triangulo é equilatero");
        }
        if(l1 == l2 && l1 != l3 && l2 != l3){
            System.out.println("O Triangulo é isoceles");  
        }
        if(l1 == l3 && l1 != l2 && l3 != l2){
            System.out.println("O Triangulo é isoceles");
        }
        if(l2 == l3 && l2 != l1 && l3 != l1){
            System.out.println("O Triangulo é isoceles");
        }
        if(l1 != l3 && l3 != l2 && l2 != l1){
            System.out.println("O Triangulo é escaleno");
        }
    }
}

