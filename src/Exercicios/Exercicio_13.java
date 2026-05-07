package Exercicios;

import java.util.Scanner;

public class Exercicio_13 {
    public static void main (String[] args) {
        Scanner Telefonia = new Scanner(System.in);
        int Minutos = 0;
        double valor;

        System.out.println("Quantos minutos de telefone você consumiu: ");
        Minutos = Telefonia.nextInt();

        if (Minutos <= 100) {
            valor = 50;
        } else {
            valor = (((Minutos - 100) * 2) + 50);
        }
        System.out.printf("Valor a pagar: %.2f%n ", valor);
    }
}
