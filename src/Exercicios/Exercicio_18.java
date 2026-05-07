package Exercicios;

import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        double x, y;

        do {
            System.out.print("x: ");
            x = numeros.nextDouble();

            System.out.print("y: ");
            y = numeros.nextDouble();

            if (x != 0 && y != 0) {
                if (x > 0 && y > 0) {
                    System.out.println("Primeiro");
                } else if (x < 0 && y > 0) {
                    System.out.println("Segundo");
                } else if (x < 0 && y < 0) {
                    System.out.println("Terceiro");
                } else if (x > 0 && y < 0) {
                    System.out.println("Quarto");
                }
            }

        } while (x != 0 && y != 0);
    }
}