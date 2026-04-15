package Exercicios;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver se ele é Par ou Ímpar: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.format("O número " + numero +" é PAR");
        }
        else {
            System.out.format("O número " + numero +" é Ímpar");
        }
    }
}
