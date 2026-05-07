package Exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio_15 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, conta = 0;

        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();

        while( numero != 0) {
            conta += numero;
            System.out.print("Digite um numero: ");
            numero = scanner.nextInt();
        }
        System.out.println("Conta = " + conta);
    }
}