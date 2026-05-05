package Exercicios;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double A,B,C;

        System.out.println("Qual o valor de A: ");
        A = sc.nextDouble();
        System.out.println("Qual o valor de B: ");
        B = sc.nextDouble();
        System.out.println("Qual o valor de C: ");
        C = sc.nextDouble();

        double triangulo = ((A * C ) / 2);
        double circulo = (Math.pow(C, 2.0) * Math.PI);
        double trapezio = (((A + B) * C) / 2);
        double quadrado = (Math.pow(B, 2.0));
        double retangulo = (A * B);

        System.out.printf("TRIANGULO : %.3f%n", triangulo);
        System.out.printf("CIRCULO : %.3f%n", circulo);
        System.out.printf("TRAPEZIO : %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
    }
}
