package com.mycompany.lista2;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        double valorMerc, pagamento, parcela, valorDesc;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da mercadoria: ");
        valorMerc = sc.nextDouble();

        System.out.println("Formas de Pagamento");
        System.out.println("1-Dinheiro ou Cheque");
        System.out.println("2-Cartao de credito");
        pagamento = sc.nextDouble();

        System.out.println("Parcelas: ");
        System.out.println("1-A vista");
        System.out.println("2-Duas vezes");
        System.out.println("3-Tres vezes");
        parcela = sc.nextDouble();

        if (pagamento == 1 && parcela == 1) {
            valorDesc = (valorMerc * 0.10) - valorMerc;
            System.out.println("O valor a ser pago é de" + valorDesc + " reais");
        }
        if (pagamento == 1 && parcela == 2) {
            System.out.println("O valor a ser pago é 2 parcelas de: " + valorMerc / 2 + " reais");
        }
        if (pagamento == 1 && parcela == 3) {
            valorDesc = (valorMerc * 0.15) + valorMerc;
            System.out.println("O valor a ser pago é 3 parcelas de: " + valorDesc / 3 + " reais");
        }
        if (pagamento == 2 && parcela == 1) {
            valorDesc = (valorMerc * 0.10) - valorMerc;
            System.out.println("O valor a ser pago é de: " + valorDesc + " reais");
        }
        if (pagamento == 2 && parcela == 2) {
            System.out.println("O valor a ser pago é 2 parcelas de: " + valorMerc / 2 + " reais");
        }
        if (pagamento == 2 && parcela == 3) {
            valorDesc = (valorMerc * 0.15) + valorMerc;
            System.out.println("O valor a ser pago é 3 parcelas de: " + valorDesc / 3 + " reais");
        }
    }
}
