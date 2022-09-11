package com.mycompany.lista7;

public class Exercicio02 {

    public static void main(String[] args) {
        int[] the100 = new int[100];

        for (int i = 0; i < 100; i++) {
            the100[i] = i;

            if (the100[i] % 7 != 0 && the100[i] % 10 != 7) {
                System.out.println(the100[i]);
            }
        }
    }
}
