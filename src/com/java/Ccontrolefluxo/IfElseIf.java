package com.java.Ccontrolefluxo;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digita nota: ");

        double nota = entrada.nextDouble();

        if (nota > 1 || nota < 0) {
            System.out.println("Nota invalida");
        } else if (nota >= 8.1) {
            System.out.println("Conceito A");
        } else if (nota >= 6.1) {
            System.out.println("Conceito B");
        } else if (nota >= 4.1) {
            System.out.println("Conceito C");
        } else if (nota >= 2.1) {
            System.out.println("Conceito C");
        }

        System.out.println("Fim do programa!!!");
        entrada.close();
    }
}
