package Exercicios;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diferenca = (A * B - C * D);
        System.out.print("A diferença entre os produtos de A e B para C e D é = " + diferenca);
    }
}
