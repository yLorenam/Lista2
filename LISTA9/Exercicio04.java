package com.mycompany.lista9;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        int[][] aluno = new int[5][4];
        double maiorNota = 0, notaFinal = 0;
        int i, j, lin1 = 0;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 4; i++) {
            System.out.println("Informe o numero da Matricula: ");
            aluno[i][0] = sc.nextInt();
            System.out.println("Informe a media das provas: ");
            aluno[i][1] = sc.nextInt();
            System.out.println("Informe a media dos trabalhos : ");
            aluno[i][2] = sc.nextInt();

            aluno[i][3] = aluno[i][1] + aluno[i][2];
        }
        for (j = 0; j < 5; j++) {
            if (aluno[j][3] > maiorNota) {
                maiorNota = aluno[j][3];
                lin1 = j;
            }
            notaFinal += aluno[j][3];
        }
        notaFinal /= 5;
        System.out.println("A matricula do aluno com maior nota final é: " + aluno[lin1][0]);
        System.out.println("Media aritmetica das notas finais é: " + notaFinal);
    }
}
