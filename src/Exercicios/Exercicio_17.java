package Exercicios;

import java.util.Scanner;

public class Exercicio_17 {
    public static void main (String[] argsg) {
        Scanner senha = new Scanner(System.in);
        int senha_valor = 2002;

        System.out.print("Digite o a senha: ");
        senha_valor = senha.nextInt();

        while (senha_valor != 2002) {
            System.out.println("Senha inválida tente novamente !");
            System.out.print("Digite o a senha: ");
            senha_valor = senha.nextInt();
            if (senha_valor == 2002) {
                System.out.println("Acesso Permitido");
                break;
            }
        }   System.out.print("Acesso permitido");
    }
}
