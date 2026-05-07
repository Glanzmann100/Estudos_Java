package Exercicios;

import java.util.Scanner;

public class Exercicio_20 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0)
                System.out.println(i);

        }
    }
}
