package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        int codigoAluno;
        double n1, n2, n3, mediaExercicios, mediaAproveitamento;
        String conceito;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a matrícula do aluno: ");
        codigoAluno = sc.nextInt();

        System.out.println("Informa a primeira nota do aluno: ");
        n1 = sc.nextDouble();

        System.out.println("Informa a primeira nota do aluno: ");
        n2 = sc.nextDouble();

        System.out.println("Informa a primeira nota do aluno: ");
        n3 = sc.nextDouble();

        mediaExercicios = (n1 + n2 + n3) / 3;

        mediaAproveitamento = (n1 + (n2 * 2) + (n3 * 3) + mediaExercicios) / 7;

        if (mediaAproveitamento >= 9.0) {
            conceito = "A";
            System.out.println("O código do aluno é: " + codigoAluno + "\n"
                    + "As notas do aluno foram: " + n1 + ", " + n2 + ", " + n3 + "\n"
                    + "A média de exercícios foi de: " + mediaExercicios + "\n"
                    + "A média de Aproveitamento é: " + conceito + " \n"
                    + "O Aluno está aprovado.");

        } else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
            conceito = "B";
            System.out.println("O código do aluno é: " + codigoAluno + "\n"
                    + "As notas do aluno foram: " + n1 + ", " + n2 + ", " + n3 + "\n"
                    + "A média de exercícios foi de: " + mediaExercicios + "\n"
                    + "A média de Aproveitamento é: " + conceito + " \n"
                    + "O Aluno está aprovado.");
        } else if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
            conceito = "C";
            System.out.println("O código do aluno é: " + codigoAluno + "\n"
                    + "As notas do aluno foram: " + n1 + ", " + n2 + ", " + n3 + "\n"
                    + "A média de exercícios foi de: " + mediaExercicios + "\n"
                    + "A média de Aproveitamento é: " + conceito + " \n"
                    + "O Aluno está aprovado.");
        } else if (mediaAproveitamento >= 4.0 && mediaAproveitamento < 6.0) {
            conceito = "D";
            System.out.println("O código do aluno é: " + codigoAluno + "\n"
                    + "As notas do aluno foram: " + n1 + ", " + n2 + ", " + n3 + "\n"
                    + "A média de exercícios foi de: " + mediaExercicios + "\n"
                    + "A média de Aproveitamento é: " + conceito + " \n"
                    + "O Aluno está reprovado.");
        } else if (mediaAproveitamento < 4.0 && mediaAproveitamento >= 0) {
            conceito = "E";
            System.out.println("O código do aluno é: " + codigoAluno + "\n"
                    + "As notas do aluno foram: " + n1 + ", " + n2 + ", " + n3 + "\n"
                    + "A média de exercícios foi de: " + mediaExercicios + "\n"
                    + "A média de Aproveitamento é: " + conceito + " \n"
                    + "O Aluno está reprovado.");
        }
    }
}
