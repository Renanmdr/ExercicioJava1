package com.Unama;

import java.util.Scanner;

public class Ex10Moeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double real, dolar;
        System.out.println("informe o valor em Reais:");
        real = sc.nextDouble();
        System.out.println("Informe o valor em Dolar:");
        dolar = sc.nextDouble();
        System.out.println("o valor em dolar e:"+real/dolar);

    }
}
