package Exercicios;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_24 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite os valores do triangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os valores do triangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double perimetro_x = (x.a + x.b + x.c);
        double semiPerimetro_x = (perimetro_x / 2);
        double perimetro_y = (y.a + y.b + y.c);
        double semiPerimetro_y = (perimetro_y / 2);
        double area_X = Math.sqrt(semiPerimetro_x * (semiPerimetro_x - x.a) * (semiPerimetro_x - x.b) * (semiPerimetro_x - x.c));
        double area_y = Math.sqrt(semiPerimetro_y * (semiPerimetro_y - y.a) * (semiPerimetro_y - y.b) * (semiPerimetro_y - y.c));

        showResult(area_X, area_y);
    }

    public static void showResult(double area_X, double area_y) {
        if (area_X > area_y) {
            System.out.printf("Triangulo X tem a maior area: %.4f%n", area_X);
        } else {
            System.out.printf("Triangulo Y tem a maior area: %.4f%n", area_y);
        }
    }
}