package com.mycompany.lista3;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        String nome;
        String sexo;
        String estCivil;
        int idade;
        double salario;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome:");
        nome = sc.next();

        while (nome.length() <= 3) {
            System.out.println("Nome invalido!!");
            System.out.println("Informe o nome:");
            nome = sc.next();
        }

        System.out.println("Informe a idade:");
        idade = sc.nextInt();

        while (idade < 0 || idade > 150) {
            System.out.println("Idade invalida!!");
            System.out.println("Informe a idade:");
            idade = sc.nextInt();
        }

        System.out.println("Informe o salario:");
        salario = sc.nextDouble();

        while (salario < 0) {
            System.out.println("Salario invalido!!");
            System.out.println("Informe o salario:");
            salario = sc.nextDouble();
        }

        System.out.println("Infome o sexo F/M:");
        sexo = sc.next();

        while (!"f".equals(sexo) && !"m".equals(sexo)) {
            System.out.println("Informacao invalida!!");
            System.out.println("Infome o sexo F/M:");
            sexo = sc.next();
        }

        System.out.println("Informe o estado civil 'S'-Solteiro / 'C'-Casado / 'V'-Viuvo / 'D'-Divorciado:");
        estCivil = sc.next();

        while (!"s".equals(estCivil) && !"c".equals(estCivil) && !"v".equals(estCivil) && !"d".equals(estCivil)) {
            System.out.println("Informacao invalida!!");
            System.out.println("Informe o estado civil 'S'-Solteiro / 'C'-Casado / 'V'-Viuvo / 'D'-Divorciado:");
            estCivil = sc.next();
        }
    }
}
