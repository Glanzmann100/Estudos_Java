package Exercicios;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de um raio para ver a área do círculo: ");
        Double numero = sc.nextDouble();

        Double area = (3.14159 * numero * numero);
        System.out.print("A área do circulo cujo o raio é " + numero + " é " + area);
    }
}
