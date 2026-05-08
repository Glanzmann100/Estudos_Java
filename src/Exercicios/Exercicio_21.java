package Exercicios;

import java.util.Scanner;

public class Exercicio_21 {
    public static void main (String[] args) {
        Scanner contador_numeros = new Scanner(System.in);

        System.out.print("Digite um número de vezes para rodar o código: ");
        int numero = contador_numeros.nextInt();
        int dentro = 0;
        int fora = 0;

        for (int i = 0; i < numero; i++) {
            int x = contador_numeros.nextInt();
            if (x >= 10 && x <= 20) {
                dentro++;
            } else if (x <= 0) {
                break;
            } else {
                fora++;
            }
        }
        System.out.println(dentro + " in");
        System.out.println(fora + " out");
    }
}