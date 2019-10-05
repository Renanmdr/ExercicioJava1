package com.Unama;

import java.util.Scanner;

public class Ex7MetroQuadrado {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double comprimento, largura;
        System.out.println("Informe o Comprimento:");
        comprimento = sc.nextDouble();
        System.out.println("Informe a Largura:");
        largura = sc.nextDouble();
        System.out.println(" o metro quandrado e:"+comprimento*largura+" M2");
    }
}
