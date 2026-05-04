package Exercicios;

import java.util.Scanner;

public class Exercicio_9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, horas_trabalhadas;
        Double valor, salario;

        System.out.print("Digite seu numero: ");
        numero = sc.nextInt();
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        horas_trabalhadas = sc.nextInt();
        System.out.print("Digite o valor ganho por hora: ");
        valor = sc.nextDouble();

        salario = (horas_trabalhadas * valor);
        System.out.println("Número = " + numero);
        System.out.printf("Salario = %.2f", + salario);
    }
}
