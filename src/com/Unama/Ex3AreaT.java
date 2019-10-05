package com.Unama;

import java.util.Scanner;

public class Ex3AreaT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a base:");
        double base = (double)sc.nextInt();
        System.out.println("informe a altura:");
        double altura = (double)sc.nextInt();
        System.out.println(" a area do triagulo e:" + altura * base / 2);
    }
}
