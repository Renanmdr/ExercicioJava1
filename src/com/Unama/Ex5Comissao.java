package com.Unama;

import java.util.Scanner;

public class Ex5Comissao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total;
        System.out.println("informe total de vendas:R$");
        total = sc.nextInt();
        System.out.println("a comissão do vendendor e R$ "+total*0.10);
    }
}
