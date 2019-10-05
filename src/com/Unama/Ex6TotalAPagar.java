package com.Unama;

import java.util.Scanner;

public class Ex6TotalAPagar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade;
        double preco;
        System.out.println("informe quantidade do produto:");
        quantidade = sc.nextInt();
        System.out.println("informe o preço do produto R$:");
        preco = sc.nextDouble();
        System.out.println("o total a ser pago e:R$"+quantidade*preco);

    }
}
