package Exercicios;

import java.util.Scanner;

public class Exercicio_19 {
    public static void main (String[] args) {
         Scanner numero_produto = new Scanner(System.in);
         int numero;
         int alcool = 0;
         int gasolina = 0;
         int diesel = 0;


        do {
            System.out.print("Digite o o numero do produto que deseja usar, 1.Álcool 2.Gasolina 3.Diesel: ");
            numero = numero_produto.nextInt();
            if (numero == 1) {
                alcool++;
            }
            else if (numero == 2) {
                gasolina++;
            }
            else if (numero == 3) {
                diesel++;
            }

        } while (numero < 4 && numero > 0);
        System.out.println("Muito obrigado\nÁlcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);    }
}
