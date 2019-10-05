package com.Unama;

import java.util.Scanner;

public class Ex9Total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor,desconto, total;
        System.out.println("Informe o valor da compra:RS");
        valor = sc.nextDouble();
        System.out.println("Informe o valor de Desconto:R$");
        desconto = sc.nextDouble();
        total = (valor)-valor*desconto/100;
        System.out.println("O valor a ser pago e:R$"+total);
    }

}
