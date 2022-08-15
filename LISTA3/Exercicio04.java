package com.mycompany.lista3;

public class Exercicio04 {

    public static void main(String[] args) {
        double paisA = 80000, paisB = 200000;
        double crescA = 0.03, crescB = 0.015, anos = 0;

        while (paisA < paisB) {
            paisA = paisA + (paisA * crescA);
            paisB = paisB + (paisB * crescB);
            anos = anos + 1;
        }
        System.out.println("Sera necessario " + anos + " anos para o pais A alcancar a populacao dos pais B");
    }
}
