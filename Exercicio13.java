package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        int lados;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantos lados tem o poligono: ");
        lados = sc.nextInt();

        if (lados == 3) {
            double b, h, area;
            System.out.println("Informe a medida da base triangulo: ");
            b = sc.nextDouble();

            System.out.println("Informe a medida da altura do triangulo: ");
            h = sc.nextDouble();

            area = (b * h) / 2;

            System.out.println("A medida da area deste TRIANGULO é: " + area);
        }
        if (lados == 4) {
            double l, area;
            System.out.println("Informe a medida do lado do quadrado: ");
            l = sc.nextDouble();
            area = l * l;

            System.out.println("A medida da area deste QUADRADO é: " + area);
        }        
        if (lados == 5) {
            System.out.println("O poligono informado é um PENTAGONO");
        }
        
        //Exercicio 14
        if (lados < 3){
            System.out.println("Nao é um poligono");
        }
        if (lados > 5){
            System.out.println("Poligono nao identificado");
        }
    }
}
