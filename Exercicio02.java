
package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        String nome, sexo, estCivil;
        int anos;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o nome: ");
        nome = sc.nextLine();
        
        System.out.println("Informe o sexo (F/M): ");
        sexo = sc.next();
        
        System.out.println("Informe o Estado Civil");
        estCivil = sc.next();

        if(sexo.equals("F") && estCivil.equals("Casada")){
            System.out.println("Informe quantos anos é casada");
            anos = sc.nextInt();
        }
    }
}
