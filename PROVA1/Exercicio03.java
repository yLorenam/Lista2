package com.mycompany.provaintroducao;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        double massaInicial, massaFinal;
        int tempoTotal = 0, tempoHr, tempoMin, tempoSeg;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a massa do material radioativo em gramas: ");
        massaInicial = sc.nextDouble();
        
        massaFinal = massaInicial;

        while (massaFinal >= 0.05) {
            massaFinal = massaFinal / 2;
            tempoTotal = tempoTotal + 50;
        }
        tempoHr = (tempoTotal / 3600);
        tempoMin = (tempoTotal % 3600) / 60;
        tempoSeg = (tempoTotal % 3600) % 60;
        System.out.println("A massa inicial é de: " + massaInicial);
        System.out.println("A massa final é de: " + massaFinal);
        System.out.println(" ");
        System.out.println("O tempo gasto foi de " + tempoHr + " HORAS " + tempoMin + " MINUTOS e " + tempoSeg + " SEGUNDOS");
    }
}
