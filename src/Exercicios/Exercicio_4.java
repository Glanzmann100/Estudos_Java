package Exercicios;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2, resultado;

        System.out.print("Qual opercação deseja fazer: ");
        String escolha = scanner.next();

        System.out.print("Qual o primeiro numero: ");
        numero1 = scanner.nextDouble();

        System.out.print("Qual o segundo numero: ");
        numero2 = scanner.nextDouble();


        if (escolha.equalsIgnoreCase("Adição")) {
            resultado = numero1 + numero2;
        }
        else if (escolha.equalsIgnoreCase("Subtração")) {
            resultado = numero1 - numero2;
        }
        else if (escolha.equalsIgnoreCase("Divisão")) {
            resultado = numero1 / numero2;
        }
        else if (escolha.equalsIgnoreCase("Multiplicação")) {
            resultado = numero1 * numero2;
        }
        else {
            System.out.print("Operação Inválida");
            return;
        }
        System.out.print("Resultado: " + resultado);
    }
}