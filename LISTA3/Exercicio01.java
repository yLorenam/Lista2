
package com.mycompany.lista3;

import java.util.Scanner;

public class Exercicio01{

    public static void main(String[] args) {
        int nota;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe sua nota: ");
        nota = sc.nextInt();
        
        while(nota > 10){
            System.out.println("Nota invalida!!");
            System.out.println("Informe sua nota: "); 
            nota = sc.nextInt();
        }
    }
}
