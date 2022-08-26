package com.mycompany.provaintroducao;

public class Exercicio02 {

    public static void main(String[] args) {
        double salario = 1000, percentual = 1.5 / 100;
        int ano = 1995;

        do {
            ano = ano + 1;
            salario = salario * (1 + percentual);
            percentual = percentual * 2;
        } while (ano < 2022);
        System.out.println("O salario recebido em 2022 é: " + salario);
    }

}
