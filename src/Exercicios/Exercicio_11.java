package Exercicios;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int peca1, peca2, numero_pecas1, numero_pecas2;
        double valor1, valor2;
        double resultado = 0;

        System.out.println("Digite o código da primeira peça: ");
        peca1 = sc.nextInt();
        System.out.println("Quantas peças de modelo " + peca1 + " você deseja ?");
        numero_pecas1 = sc.nextInt();
        System.out.println("Qual o valor da peça de código: " + peca1);
        valor1 = sc.nextDouble();
        System.out.println("Digite o código da segunda peça: ");
        peca2 = sc.nextInt();
        System.out.println("Quantas peças de modelo " + peca2 + " você deseja ?");
        numero_pecas2 = sc.nextInt();
        System.out.println("Qual o valor da peça de código: " + peca2);
        valor2 = sc.nextDouble();

        resultado = ((valor1 * numero_pecas1) + (valor2 * numero_pecas2));
        System.out.printf("Valor a pagar: R$ %.2f%n", resultado);
    }
}
