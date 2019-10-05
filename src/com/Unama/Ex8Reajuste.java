package com.Unama;

import java.util.Scanner;

public class Ex8Reajuste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario,reajuste,nsal;
        System.out.println("Informe o salario:R$");
        salario = sc.nextDouble();
        System.out.println("Informe Reajuste[%]:");
        reajuste = sc.nextDouble();
        nsal = salario* reajuste/100;
        System.out.println("Salario Reajustado e:R$"+salario + nsal);

    }
}
