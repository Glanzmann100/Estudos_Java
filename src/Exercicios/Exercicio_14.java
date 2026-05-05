package Exercicios;

import java.util.Scanner;

public class Exercicio_14 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");
        int dias = sc.nextInt();
        String dia;

        switch(dias) {
            case 1:
                dia = "Dia da Semana: Domingo";
                break;
            case 2:
                dia = "Dia da Semana: Segunda";
                break;
            case 3:
                dia = "Dia da Semana: Terça";
                break;
            case 4:
                dia = "Dia da Semana: Quarta";
                break;
            case 5:
                dia = "Dia da Semana: Quinta";
                break;
            case 6:
                dia = "Dia da Semana: Sexta";
                break;
            case 7:
                dia = "Dia da Semana: Sábado";
                break;
            default:
                dia = "Dia da semana: valor inválido";
                break;
        }

        System.out.print(dia);
    }
}