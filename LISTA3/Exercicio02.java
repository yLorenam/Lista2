package com.mycompany.lista3;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        String user;
        String senha;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um nome de usuario:");
        user = sc.next();

        System.out.println("Informe sua senha:");
        senha = sc.next();

        while (user.equals(senha) == senha.equals(senha)) {
            System.out.println("O usuario e senha não podem ser iguais");
            System.out.println("TENTE NOVAMENTE");
            System.out.println("Informe um nome de usuario:");
            user = sc.next();
            System.out.println("Informe sua senha:");
            senha = sc.next();
        }
    }
}
