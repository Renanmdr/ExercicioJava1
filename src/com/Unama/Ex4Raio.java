package com.Unama;

import java.util.Scanner;

public class Ex4Raio {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double raio,perimetro,area;
        System.out.println("informe o raio:");
        raio = sc.nextDouble();
        area = (raio*raio)*Math.PI;
        System.out.println("area do raio e:"+area);
        perimetro = (2*Math.PI)*raio;
        System.out.println("o perimetro do circulo e:"+perimetro);

    }
}
