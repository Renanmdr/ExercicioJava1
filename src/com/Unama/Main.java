package com.Unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("qual o seu nome?:");
        String nome = sc.nextLine();
        System.out.println("seu nome e " + nome);
        System.out.println("qual sua idade?:");
        int idade = sc.nextInt();
        System.out.print("sua idade e " + idade + " anos");
    }
}
