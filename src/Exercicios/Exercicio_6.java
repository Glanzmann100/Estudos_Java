package Exercicios;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo(a) a tabuada do Schmitz em Java: ");
        System.out.println("Escolha um número para ver sua Tabuada: ");
        int numero = sc.nextInt();

        for( int i = 1; i <= 10; i++)
            System.out.println(numero + "x" + i + "=" + (numero * i));
    }
}
